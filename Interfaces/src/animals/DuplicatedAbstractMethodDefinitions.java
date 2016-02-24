package animals;

/**
 * This interface has public scope, and as such this file should be declared in
 * a file of the same name as the interface.
 * 
 * Interfaces can only have public or default visibility.
 * 
 * @author david-milligan
 *
 */
public interface DuplicatedAbstractMethodDefinitions {
	/**
	 * This duplicates the same method in Beast, no issue, but implementing
	 * class MUST provide an implementation.
	 * 
	 * @throws ChokingOnMeDinnerException
	 */
	default void eat(String me) {
		System.out.format("Eating %s", me);
	}

	/**
	 * This overloads eat, no issue in THIS interface.
	 * 
	 * But this WOULD cause an issue to classes implementing both Beast and
	 * DuplicatedAbstractMethodDefinitions as the method signature would be the
	 * same, but different return type would cause a compilation error.
	 */
	// abstract String eat(String food);

	/**
	 * This overloads eat, no issue.
	 * 
	 * @throws ChokingOnMeDinnerException
	 */
	abstract String eat(String food, String drink);
}
