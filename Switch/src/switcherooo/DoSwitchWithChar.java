package switcherooo;

public class DoSwitchWithChar {
	final static char c = 'c';

	public static void main(String[] args) {
		byte x = 99;

		switch (x) {
		case c:
			System.out.println((int)c);
			break;
		default:
			System.out.println("default ");
		}
	}

}
