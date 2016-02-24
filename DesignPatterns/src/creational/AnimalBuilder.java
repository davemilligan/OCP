package creational;

public class AnimalBuilder {

	private String p1, p2, p3, p4, p5;

	/**
	 * We might want to make this private so objects can only be created using
	 * the Builder.
	 * 
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 */
	private AnimalBuilder(String p1, String p2, String p3, String p4, String p5) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
	}

	public String toString() {
		return p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5;
	}

	public static void main(String[] args) {
		AnimalBuilder.Builder bob = new AnimalBuilder.Builder().withP1("property1").withP2("property2")
				.withP3("property3").withP4("property4").withP5("property5");
		AnimalBuilder bo = bob.build();
		System.out.println(bo);
	}

	static class Builder {
		private String p1, p2, p3, p4, p5;

		public Builder() {
		}

		public Builder withP1(String p1) {
			this.p1 = p1;
			return this;
		}

		public Builder withP2(String p2) {
			this.p2 = p2;
			return this;
		}

		public Builder withP3(String p3) {
			this.p3 = p3;
			return this;
		}

		public Builder withP4(String p4) {
			this.p4 = p4;
			return this;
		}

		public Builder withP5(String p5) {
			this.p5 = p5;
			return this;
		}

		/**
		 * This results in code that is easy to write and very easy to read and
		 * understand. In this example, the build method could be modified to
		 * check parameters before the object is created.
		 * 
		 * @return
		 */
		public AnimalBuilder build() {
			return new AnimalBuilder(p1, p2, p3, p4, p5);
		}
	}
}
