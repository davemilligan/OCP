
/**
 * Labels must label a statement.
 * 
 * @author david-milligan
 *
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 0;
		// Labels have to label something.
		label0: x++;

		System.out.println(x);
		// But to break to a label it must be called from a loop or inside a block.
		label1: {
			if (true) {
				System.out.println("Skipping assignment");
				break label1;
			}
			x++;
			System.out.println("Wont get printed");
		}

		System.out.println(x);
		label2: x++;
		System.out.println(x);
		label3: while (true) {
			System.out.println("In label 3");
			x++;
			label4: while (true) {
				System.out.println("In label 4");
				x++;
				break label3;
			}
		}
		System.out.println(x);
		System.out.println("Finished");
	}

}
