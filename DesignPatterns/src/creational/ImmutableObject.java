package creational;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 Rules for creating immutable objects.
 * 
 * Set all properties in constructor.
 * 
 * Mark all instance variables private and final.
 * 
 * Do not define setters.
 * 
 * Do not allow referenced mutable objects to be modified, directly or
 * indirectly, return copies of objects, and take copies of init params.
 * 
 * Prevent overriding of methods, make class final.
 * 
 * @author david-milligan
 *
 */
public final class ImmutableObject {
	private final List<String> names;

	public ImmutableObject(List<String> names) {
		if (names == null)
			throw new IllegalArgumentException("names cannot be null.");

		this.names = new ArrayList<>(names);
	}

	public List<String> getNames() {
		return new ArrayList<>(names);
	}
}
