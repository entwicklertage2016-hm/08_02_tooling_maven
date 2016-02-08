package com.example.maven;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class BirthdayDayCalculater 
{
    public static void main( String[] args )
    {
    	BirthdayDayCalculater calc = new BirthdayDayCalculater();
        System.out.println( calc.calcTime(args[0]));
    }
    
    public int calcTime(String aDate){
    	DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    	DateTime dt = formatter.parseDateTime(aDate);
    	DateTime today = new DateTime();
    	Days days = Days.daysBetween(dt.toLocalDate(), today.toLocalDate());
    	return days.getDays();
    }
    
}
