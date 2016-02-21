package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LegacyList {
	public List dateList;
	

	public LegacyList() {
		dateList = new ArrayList();
		insertDate(dateList);
	}

	public List getDateList() {
		return dateList;
	}

	public void setDateList(List dateList) {
		this.dateList = dateList;
	}
	
	public void addAll(List l) {
		for (Object o: l) {
			if (o instanceof Date)
				dateList.add((Date) o);
		}
	}
	
	public void insertDate(List list) {
		list.add("This is not a date");
	}


}
