
public enum Season {
	WINTER("Low") {
		@Override
		void openingHours(int opens, int closes) {
			setOpens(opens);
			setCloses(closes);
			
		}
	}, SPRING("Medium") {
		@Override
		void openingHours(int opens, int closes) {
			setOpens(opens);
			setCloses(closes);
			
		}
	}, SUMMER("High") {
		@Override
		void openingHours(int opens, int closes) {
			setOpens(opens);
			setCloses(closes);
			
		}
		
		String closedAllday() {
			return "First week July/August";
		}
	}, AUTUMN("Low") {
		@Override
		void openingHours(int opens, int closes) {
			setOpens(opens);
			setCloses(closes);			
		}
	};

	private String expectedVisitors;
	private int opens, closes;

	private Season(String expectedVisitors) {
		System.out.println("CTOR called with " + expectedVisitors);
		this.expectedVisitors = expectedVisitors;
	}

	@Override
	public String toString() {
		return String.format("Expected visitors %s opens %d closes %d",  expectedVisitors, opens, closes);
	}
	
	//  Define an abstract method to be implemented by each value.
	abstract void openingHours(int opens, int closes);
	
	//  Define a public method used by each value.
	String closedAllDay() {
		return "First Monday of Month";
	}
	
	/**
	 * First time we use an enum values constructors are called for all
	 * available values, subsequent use of the values do not call the ctor
	 * again.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Season first = Season.WINTER;
		first.setOpens(9);
		first.setCloses(17);
		System.out.println(first);
	}

	public int getOpens() {
		return opens;
	}

	public void setOpens(int opens) {
		this.opens = opens;
	}

	public int getCloses() {
		return closes;
	}

	public void setCloses(int closes) {
		this.closes = closes;
	}
}
