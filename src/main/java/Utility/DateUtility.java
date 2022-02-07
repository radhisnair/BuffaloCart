package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMM d, yyyy hh:mm:ss a");
		String formattedDate = sdf.format(date);
		return formattedDate;
		
		}
	
}
