package animals;

/**
 * Though this can be used as a functional interface, since it is not annotated
 * someone could add another method and break functionality elsewhere.
 * 
 * @author david-milligan
 *
 */
public interface CheckTrait {
	boolean check(Animal a);
	// This does what it says on the tin, since the interface is being used as a
	// functional interface.
	// boolean frigsItAllUp();
}
