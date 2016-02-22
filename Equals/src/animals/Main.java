package animals;

public class Main {

	public static void main(String[] args) throws Exception {
		Bird eagleAsBird = new Eagle();
		Eagle castEagle = (Eagle) eagleAsBird;
		Bird castCopy = castEagle;
		Eagle differentEagle = new Eagle();
		Bird bird = new Bird();
		Bat bat = new Bat();

		if (castEagle.equals(eagleAsBird))
			System.out.println("reflexive comparison");

    	if (differentEagle.equals(castEagle) && castEagle.equals(differentEagle))
			System.out.println("symmetric comparison");
    	
		if (castCopy.equals(eagleAsBird))
			System.out.println("transitive comparison");

		if (!bird.equals(castEagle))
			System.out.println("Couldn't ever be the same");
		
		if (!bird.equals(null))
			System.out.println("Couldn't ever match null");
		
		differentEagle.name = null;
		if (!differentEagle.equals(castEagle))
			System.out.println("Null name can't match non null");
		
		differentEagle.name = "Fred";
		castEagle.name = "Joe";
		if (!differentEagle.equals(castEagle))
			System.out.println("Cant match names");
	}
}

interface Flyer {
}

class Bird implements Flyer {

	public String name = "Birdie";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Found same Bird object");
			return true;
		}
		if (obj == null) {
			System.out.println("Give a Bird something to compare!!");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("You gave me a different class from Bird");
			return false;
		}
		Bird other = (Bird) obj;
		if (name == null) {
			System.out.println("This Birds name is null");
			if (other.name != null) {
				return false;
			} else {
				System.out.println("The other Birds name is null too");
				return true;
			}
		} else if (!name.equals(other.name)) {
			System.out.println("The names are different");
			return false;
		} else {
			System.out.println("The names are the same");
			return true;
		}
	}
}

class Eagle extends Bird {

	public String name = "Birdie";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Found same Eagle object");
			return true;
		}
		if (obj == null) {
			System.out.println("Give a Eagle something to compare!!");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("You gave me a different class from Eagle");
			return false;
		}
		Eagle other = (Eagle) obj;
		if (name == null) {
			System.out.println("This Eagles name is null");
			if (other.name != null) {
				return false;
			} else {
				System.out.println("The other Eagles name is null too");
				return true;
			}
		} else if (!name.equals(other.name)) {
			System.out.println("The names are different");
			return false;
		} else {
			System.out.println("The names are the same");
			return true;
		}
	}
}

class Bat {

	public String name = "Batty";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Found same Bat object");
			return true;
		}
		if (obj == null) {
			System.out.println("Give a Bat something to compare!!");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("You gave me a different class from Bat");
			return false;
		}
		Bat other = (Bat) obj;
		if (name == null) {
			System.out.println("This Bats name is null");
			if (other.name != null) {
				return false;
			} else {
				System.out.println("The other Bats name is null too");
				return true;
			}
		} else if (!name.equals(other.name)) {
			System.out.println("The names are different");
			return false;
		} else {
			System.out.println("The names are the same");
			return true;
		}
	}
}
