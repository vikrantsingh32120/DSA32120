package gfgProblems;

import java.util.Calendar;

public class GetDayOFWeekHackerrank {

	public static void main(String[] args) {
		String date="25";
		String month="06";
		String year="2021";
		
		Calendar c=Calendar.getInstance();
		
//		the value used to set the MONTH calendar field. Month value is 0-based. e.g., 0 for January.
		c.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
		String day=getDayOfWeek((c.get(Calendar.DAY_OF_WEEK)));
		System.out.println(day.toUpperCase());
	}
	public static String getDayOfWeek(int value){
	    String day = "";
	    switch(value){
	    case 1:
	        day="Sunday";
	        break;
	    case 2:
	        day="Monday";
	        break;
	    case 3:
	        day="Tuesday";
	        break;
	    case 4:
	        day="Wednesday";
	        break;
	    case 5:
	        day="Thursday";
	        break;
	    case 6:
	        day="Friday";
	        break;
	    case 7:
	        day="Saturday";
	        break;
	    }
	    return day;
	    }    
	}
