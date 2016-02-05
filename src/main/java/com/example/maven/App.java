package com.example.maven;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( calcTime("17/04/1992"));
    }
    
    public static String calcTime(String date){
    	DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    	DateTime dt = formatter.parseDateTime(date);
    	DateTime today = new DateTime();
    	today.minusYears(dt.getYear());
    	Days days = Days.daysBetween(dt.toLocalDate(), today.toLocalDate());
    	return days.getDays()+"";
    }
    
}
