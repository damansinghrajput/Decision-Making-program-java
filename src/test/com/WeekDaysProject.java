package test.com;

public class WeekDaysProject {

	public static void main(String[] args) {
		System.out.println(weekDay(2));
		System.out.println(weekDays(2));
		System.out.println(monthNumber(2));
		
	}
	private static String weekDays(int dayNumber ) {
		switch(dayNumber) {
		case 1: System.out.println("SUNDAY");
		   break;
		   case 2: System.out.println("MONDAY");
		   break;
		   case 3: System.out.println("TUESDAY");
		   break;
		   case 4: System.out.println("WEDNESDAY");
		   break;
		   case 5: System.out.println("THURSDAY");
		   break;
		   case 6: System.out.println("FRIDAY");
		   break;
		   case 7: System.out.println("SATURDAY");
		   break;
		
		
		}
		
		return "DayNumber "+dayNumber;
	}
		
	private static String monthNumber(int month ) {
		String monthGive = "";
		switch(month) {
		case 1: monthGive = "January";
		   break;
		case 2: monthGive = "Feburay";
		   break;
		case 3: monthGive = "March";
		   break;
		case 4: monthGive = "April";
		   break;
		case 5: monthGive = "May";
		   break;
		case 6: monthGive = "June";
		   break;
		case 7: monthGive = "July";
		   break;
		case 8: monthGive = "August";
		   break;
		case 9: monthGive = "September";
		   break;
		case 10: monthGive = "October";
		   break;
		case 11: monthGive = "November";
		   break;
		 case 12: monthGive = "December";
		   break;
		   
		
		
		}
		return monthGive;
		}

	
	
	
	
	private static boolean weekDay(int weekday ) {
		switch( weekday ) {
		case 1: System.out.println("Sunday is weekdays");
		  return true ;
		case 2: System.out.println("monday is normaldays");
		  return false ;   
		case 3: System.out.println("tuesday is normaldays");
		  return false ;   
		case 4: System.out.println("wednesday is normaldays");
		  return false ;     
		case 5: System.out.println("thursday is normaldays");
		  return false ;   
		case 6: System.out.println("friday is normal");
		  return false ;   
		case 7: System.out.println("saturday is weekdays");
		  return true ;   
}

	 return false  ;
	}	

}