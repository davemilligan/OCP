package animals;

/**
 * This class demonstrates overriding and how a subclass is able to override the
 * methods of a superclass.
 * 
 * Things to note: The method signature MUST be the same in the overriding
 * method. The return type in a subclass can be the same class or a subclass of
 * the return type of the superclass. The access modifier cannot further
 * restrict the visibility of the overridden method. The overriding method MUST
 * throw the same exception or a superclass of the exception thrown by the
 * overridden method.
 * 
 * @author david-milligan
 *
 */
public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean canHop() {
		return canHop;
	}

	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", canHop=" + canHop + ", canSwim=" + canSwim + "]";
	}

}
