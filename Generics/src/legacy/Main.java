package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GenericList gList = new GenericList();
		LegacyList lList = new LegacyList();
		
		//  Fine, this works, a method that takes an untyped List can take any type of List<T>.
		lList.addAll(gList.getDateList());

		lList.insertDate(lList.getDateList());
		System.out.println(lList.getDateList());

		lList.insertDate(gList.getDateList());
		System.out.println(gList.getDateList());

		gList.loopWithTypeCheck();

		// this will run but will throw an exception when it tries to call the
		// getTime on the string.
		gList.loopWithoutTypeCheck();

		// but if i try to call the generic list method with a legacy list it
		// will not compile.
		//gList.insertDate(lList); // it will not work.

	}

}
