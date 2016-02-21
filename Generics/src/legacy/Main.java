package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GenericList gList = new GenericList();
		LegacyList lList = new LegacyList();
		lList.addAll(gList.getDateList());
		lList.insertDate(lList.getDateList());		
		lList.insertDate(gList.getDateList());
		System.out.println(lList.getDateList());
		System.out.println(gList.getDateList());
		
		gList.loopLegacy();
		// this will run but will throw an exception when it trs to call the getTime on the string. 
		gList.loop();
		
		// but if i try to call the legacy list with the generic list...
		//gList.insertDate(lList); // it will not work.
		
		
	}

}
