package MioBean;

import java.util.*;
import java.text.SimpleDateFormat;

public class giorniSS implements java.io.Serializable 
{ 
  private int giorni;  
  private String dateStr1;
  private String dateSS;
  public giorniSS() {
    giorni = 0;
    dateStr1 = "2022-01-17";
    dateSS = "2022-12-31"; //data San Silvestro
  }
  public int getGiorni() throws Exception {
    
                // input string date format
		String DATE_FORAT = "yyyy-MM-dd";
		
		// creating simple date formatter using string format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORAT);
		
		
		// converting string dateStr1 to date using simpledateformat.
		Date date1 = simpleDateFormat.parse(dateStr1);
		
		// converting string dateStr2 to date using simpledateformat.
		Date date2 = simpleDateFormat.parse(dateSS);
		
		// getting milliseconds for both dates
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		
		// getting the diff between two dates.
		long timeDiff = 0;
		if(date1InMs > date2InMs) {
			timeDiff = date1InMs - date2InMs;
		} else {
			timeDiff = date2InMs - date1InMs;
		}
		
		// converting diff into days
		int giorni = (int) (timeDiff / (1000 * 60 * 60* 24));
		
		 
      
                

                return giorni;
  }
}
