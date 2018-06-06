package com.tminnova.api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Common {
	
	public String getDatetimeString() {
		Calendar calendar = new GregorianCalendar();

	    int year = calendar.get(Calendar.YEAR);
	    String month = Integer.toString(calendar.get(Calendar.MONTH) + 1);
	    String day = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
		
		
		return "";
	}

}
