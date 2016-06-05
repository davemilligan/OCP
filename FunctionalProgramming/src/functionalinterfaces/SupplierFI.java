package functionalinterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		Supplier<LocalDate> dateSupplier = LocalDate::now;
		//  to get a new LoacalDate
		LocalDate ld = dateSupplier.get();
		System.out.println(ld.format(DateTimeFormatter.ISO_DATE));
		
		Supplier<StringBuilder> sbSupplier = StringBuilder::new;
		StringBuilder sb = sbSupplier.get();
		sb.append("Drivel");
		System.out.println(sb);
		
		Supplier<ArrayList<String>> arrayListSupplier = ArrayList<String>::new;
		ArrayList<String> arrList = arrayListSupplier.get();
		arrList.add("Total crap");
		System.out.println(arrList);
		
		System.out.println(dateSupplier);

	}

}
