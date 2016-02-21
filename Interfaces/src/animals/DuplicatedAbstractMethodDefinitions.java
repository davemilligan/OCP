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
	 * This duplicates the same method in Beast, no issue.
	 * 
	 * @throws ChokingOnMeDinnerException
	 */
	abstract void eat() throws ChokingOnMeDinnerException;

	/**
	 * This overloads eat, no issue in THIS interface.
	 * 
	 * But this WOULD cause an issue to classes implementing both Beast and
	 * DuplicatedAbstractMethodDefinitions as the method signature would be the
	 * same.
	 */
//	abstract String eat(String food);

	/**
	 * This overloads eat, no issue.
	 * 
	 * @throws ChokingOnMeDinnerException
	 */
	abstract String eat(String food, String drink);
}
