package genericinterfaces;

/**
 * Interface that ships a generic type.
 * 
 * @author david-milligan
 *
 * @param <T>
 */
public interface Shippable<T> {
	void ship(T t);
}
