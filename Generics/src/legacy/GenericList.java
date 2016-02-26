package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The GenericList class demonstrates the danger when mixing legacy and generic
 * code.
 * 
 * The generic list only accepts Date items, but when passed to the
 * LegacyList::insertDate method, the insertDate method actually adds a String
 * which would not be allowed in this class.
 * 
 * 
 * 
 * @author david-milligan
 *
 */
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
		for (Date o : l) {
			dateList.add((Date) o);
		}
	}

	public void insertDate(List<Date> list) {
		list.add(new Date());
	}

	public void loopWithoutTypeCheck() {
		for (Date d : dateList) {
			System.out.println("date:" + d.getTime());
		}
	}

	/**
	 * If mixing legacy and generic code care should be taken to check the type
	 * of items in the list before processing, else a ClassCastException will be
	 * thrown.
	 * 
	 * 
	 */
	public void loopWithTypeCheck() {
		for (Object d : dateList) {
			if (d instanceof Date)
				System.out.println("date:" + ((Date) d).getTime());
		}
	}
}
