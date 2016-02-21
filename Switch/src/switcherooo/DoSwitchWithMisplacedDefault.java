package switcherooo;

public class DoSwitchWithMisplacedDefault {

	public static void main(String[] args) {
		int x = 9;

		//  This will fall through all case blocks below default.
		switch (x) {
		case 1:
			int y = 5;
			System.out.println(1);
		case 2:
			System.out.println(2);
		default:
			System.out.println("default ");
			y = 1;
		case 3:
			System.out.println(3);
			y = 6;
		case 4:
			System.out.println(4);
		}
	}

}
