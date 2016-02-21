package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericList {
	public List<Date> dateList;

	public List<Date> getDateList() {
		return dateList;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	public GenericList() {
		dateList = new ArrayList<>();
		dateList.add(new Date());
	}
	
	public void addAll(List<Date> l) {
		for (Date o: l) {
			dateList.add((Date) o);
		}
	}
	
	public void insertDate(List<Date> list) {
		list.add(new Date());
	}
	
	public void loop() {
		for (Date d: dateList) {
			System.out.println("date:" + d.getTime());
		}
	}
	
	//  This gets round the mix of legacy and generic lists.
	public void loopLegacy() {
		for (Object d: dateList) {
			if (d instanceof Date)
				System.out.println("date:" + ((Date)d).getTime());
		}
	}
}
