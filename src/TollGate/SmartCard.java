package TollGate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SmartCard {
	public static int startingCardno=4500;
    public int cardno;
    public String issuedate;
    public String expirydate;
    SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyy");
    
    public SmartCard(){
    	
    }
    
    public String AssgnCard() {
    	Calendar cal=Calendar.getInstance();
    	this.cardno=startingCardno++;
    	this.issuedate=sdf.format(cal.getTime());
    	cal.add(Calendar.MONTH, 1);
    	this.expirydate=sdf.format(cal.getTime());
    	return ("\nCard Number = "+cardno+"\nIssue Date = "+issuedate+"\nExpiryDate = "
    	+expirydate);
    }
    public String RenewCard() {
    	Calendar cal=Calendar.getInstance();
    	this.issuedate=sdf.format(cal.getTime());
    	cal.add(Calendar.MONTH, 1);
    	this.expirydate=sdf.format(cal.getTime());
    	return ("\nCard Number = "+cardno+"\nIssue Date = "+issuedate+"\nExpiryDate = "
    	+expirydate);
    }
}
