package optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Using an Optional as a return type is a clear statement that there might not
 * be a value.
 * 
 * @author david-milligan
 *
 */
public class Main {

	public static void main(String[] args) {
		Optional<Double> opt1 = average(new int[] { 1, 2, 3, 4, 5, 6 });
		if (opt1.isPresent())
			System.out.println(opt1.get());

		Optional<Double> opt2 = average();
		try {
			System.out.println(opt2.get());
		} catch (NoSuchElementException ex) {
			System.out.println(ex);
		}
		try {
			Optional<Double> nullOpt = Optional.of(null);
			System.out.println(nullOpt);
		} catch (NullPointerException ex) {
			System.out.format("Cannot create Optional.of(null) %s%n", ex);
		}

		// Same as Optional.empty()
		Optional<Double> optNull = Optional.ofNullable(null);
		System.out.println(optNull);

		// Check ifPresent
		optNull.ifPresent(System.out::println);

		// If not present return something else
		Double otherwise = optNull.orElse(0.5);
		System.out.println(otherwise);

		// The Supplier here must return a Optional<Double>
		Double otherwiseGot = optNull.orElseGet(() -> 0.6);
		System.out.println(otherwiseGot);

		try {
			// The Supplier here must return a Optional<Throwable>
			optNull.orElseThrow(() -> new NullPointerException("Ya get me"));
		} catch (NullPointerException ex) {
			System.out.println(ex);
		}

	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();

		int sum = 0;
		for (int i : scores)
			sum += i;
		return Optional.of((double) sum / scores.length);
	}
}
