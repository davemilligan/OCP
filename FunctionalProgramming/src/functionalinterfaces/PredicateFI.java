package functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {
		Predicate<String> strPredicate = String::isEmpty;
		boolean wasEmpty = strPredicate.test("NotEmpty");
		System.out.println(wasEmpty);
		
		BiPredicate<String, String> biPred = String::startsWith;
		BiPredicate<String, String> sameAs = (string, prefix) -> string.startsWith(prefix);
		boolean itDoes = biPred.test("Catfish", "Cat");
		boolean soDoesThis = sameAs.test("DogFish", "Dog");
		System.out.println(itDoes);
		System.out.println(soDoesThis);
		
		System.out.println(biPred);
	}

}
