package animals;

/**
 * Though this can be used as a functional interface, since it is not annotated
 * someone could add another method and break functionality elsewhere.
 * 
 * @author david-milligan
 *
 */
public interface ConsumeAnimal {
	void consume(Animal a);
}
