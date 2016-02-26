package legacy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This Legacy list is here to demonstrate type erasure.
 * 
 * @author david-milligan
 *
 */
public class LegacyList {
	/**
	 * The class has a private member variable of type List. List has no type
	 * and can contain anything.
	 */
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

	/**
	 * The addAll method takes a list and adds each item in the list to the
	 * private list if the item is an instance of a date. Note it checks first,
	 * though if the item was not a date then it would not throw an error since
	 * a List can take any object
	 * 
	 * @param list
	 */
	public void addAll(List list) {
		for (Object o : list) {
			if (o instanceof Date)
				dateList.add((Date) o);
		}
	}

	/**
	 * When insertDate is called, we mean to insert a date into the same list,
	 * but any object can be inserted into the list passed as an argument as the
	 * list does not have a type. Here the method in fact adds a string.
	 * 
	 * When we pass the Generic List of
	 * 
	 * @param list
	 */
	public void insertDate(List list) {
		list.add("This is not a date");
	}

}
