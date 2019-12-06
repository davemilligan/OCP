import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());


		LocalDate myBirthday = LocalDate.of(1964, 4, 30);
		LocalDate dayBeforeMBirthday = myBirthday.plus(Period.ofDays(-1));
		LocalDate dayAfterMBirthday = myBirthday.plus(Period.ofDays(1));
		boolean isBetween = !myBirthday.isBefore(dayBeforeMBirthday) && !myBirthday.isAfter(dayAfterMBirthday);
		System.out.println(String.format("My birthday is between %s  and  %s %s", dayBeforeMBirthday, dayAfterMBirthday, isBetween));


		LocalTime rightNow = LocalTime.of(12, 30, 30);
		LocalDateTime dateTime = LocalDateTime.of(2015, 4, 30, 12, 30, 30);

		System.out.println(myBirthday.getDayOfWeek());
		System.out.println(rightNow);
		System.out.println(dateTime);

		Period years = Period.ofYears(myBirthday.getYear());
		Period months = Period.ofMonths(myBirthday.getMonthValue());
		Period days = Period.ofDays(myBirthday.getDayOfYear());
		Period daysAgain = days.ofDays(myBirthday.getDayOfYear()); // not really
																	// recommended,
																	// serves no
																	// purpose.

		System.out.println(years);
		System.out.println(months);
		System.out.println(days);
		System.out.println(daysAgain);

		System.out.println(myBirthday.plus(years));
		// System.out.println(rightNow.plus(years)); // cannot do this, throws
		// UnsupportedTemporalTypeException

		System.out.println(myBirthday.format(DateTimeFormatter.ISO_DATE));
		System.out.println(rightNow.format(DateTimeFormatter.ISO_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

		DateTimeFormatter longDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fullDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(myBirthday.format(longDate));
		System.out.println(myBirthday.format(mediumDate));
		System.out.println(myBirthday.format(shortDate));
		System.out.println(myBirthday.format(fullDate));
		System.out.println(longDate.format(myBirthday));
		System.out.println(mediumDate.format(myBirthday));
		System.out.println(shortDate.format(myBirthday));
		System.out.println(fullDate.format(myBirthday));

		// DateTimeFormatter longDateTime =
		// DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); // this will
		// not work as there is no TZ in local date time.
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		// DateTimeFormatter fullDateTime =
		// DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); // this will
		// not work as there is no TZ in local date time.
		// System.out.println(dateTime.format(longDateTime));
		System.out.println(dateTime.format(mediumDateTime));
		System.out.println(dateTime.format(shortDateTime));
		// System.out.println(dateTime.format(fullDateTime));
		// System.out.println(longDateTime.format(dateTime));
		System.out.println(mediumDateTime.format(dateTime));
		System.out.println(shortDateTime.format(dateTime));
		// System.out.println(fullDateTime.format(dateTime));

		LocalDate formatterDate = LocalDate.of(2006, 1, 1);
		DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("dd MM yy"); // full
																						// month
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("dd MMM yy"); // MMM
																		// Three
																		// letter
																		// month
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("dd MM yy"); // MM Two
																	// digits
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("dd M yy"); // M just
																	// digits,
																	// no
																	// padding
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("d M yy"); // d just
																	// digits,
																	// no
																	// padding
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("d M y"); // y just last
																	// 2 digits,
																	// whatever
																	// they are
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("d M yyy"); // y all 4
																	// digits
		System.out.println(formatterDate.format(patternFormatter));
		patternFormatter = DateTimeFormatter.ofPattern("d M yyyy"); // y all 4
																	// digits
		System.out.println(formatterDate.format(patternFormatter));

		LocalDate parseddate = LocalDate.parse("04 4 1964", patternFormatter);
		System.out.println(parseddate);

	}

    public static List<Product> getProductsSellingOver(
            List<Sale> sales,
            LocalDate startDate,
            LocalDate endDate,
            int boundary) {
        final Map<Integer, Integer> salesPerProduct = new HashMap<>();

        getSalesBetweenDates(
                sales,
                startDate,
                endDate).forEach(s -> {
            int currentTotal = (salesPerProduct.containsKey(s.pid)) ? salesPerProduct.get(s.pid) : 0;
            salesPerProduct.put(s.pid, currentTotal + s.volume);
        });

        final List<Integer> pids = new ArrayList<>();
        salesPerProduct.keySet().stream().forEach(pid -> {
            if (salesPerProduct.get(pid) > 200) {
                pids.add(pid);
            }
        });
        return pids
                .stream()
                .map(pid -> getProduct(pid))
                .collect(Collectors.toList());
    }

    public static int getTotalsBetweenDates(
            List<Sale> sales,
            LocalDate startDate,
            LocalDate endDate) {
        return getSalesBetweenDates(sales, startDate, endDate)
                .stream()
                .map(s -> s.volume)
                .reduce(0, (total, volume) -> {
            return total += volume;
        });
    }

    public static int getSalesTotalsOnDate(List<Sale> sales, LocalDate date) {
        return getSalesOnDate(sales, date)
                .stream()
                .map(s -> s.volume)
                .reduce(0, (total, volume) -> {
            return total += volume;
        });
    }

    public static List<Sale> getSalesBetweenDates(
            List<Sale> sales,
            LocalDate startDate,
            LocalDate endDate) {
        return sales
                .stream()
                .filter(s-> s.date.isAfter(startDate) && s.date.isBefore(endDate))
                .collect(Collectors.toList());
    }

    public static List<Sale> getSalesOnDate(List<Sale> sales, LocalDate date) {
        return sales
                .stream()
                .filter(s-> s.date.equals(date))
                .collect(Collectors.toList());
    }

	public static int getSales(List<Sale> sales) {
	    return sales.stream().map(s -> s.volume).reduce(0, (total, volume) -> {
	        return total += volume;
        });
    }

    //  Placeholder
    public static Product getProduct(int pid) {
	    return new Product();
    }

}

class Sale {
    int pid;
    int volume;
    LocalDate date;
}

class Product {
    int id;
    double price;
    String name;
}
