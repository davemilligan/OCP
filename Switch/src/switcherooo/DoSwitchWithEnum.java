package switcherooo;

public class DoSwitchWithEnum {
	String[] a;
	int[]b [] = {{1,2},{3,4}};
	Object c = new long[4];
	Object d = a;


	final static short x = 2;
	final static int y = 0;
	public static void main(String[]args) {
		

		for (int z = 0; z < 4; z++) {
			switch(z) {
			case x: System.out.println("0 ");
			case x-1: System.out.println("1 "); break;
			default: System.out.println("def ");
			case x-2: System.out.println("2 ");
			}
		}
	}

}
