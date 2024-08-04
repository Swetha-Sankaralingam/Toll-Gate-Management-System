package TollGate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ticket {
	public static int StartingTicketId=1000;
    public int TicketId;
    public String Tickettype;
    public String issueTime;
    public String expiryTime;
    
    public Ticket() {
 	   
    }
    
    public String AssgnTicket(String Type) {
 	   this.TicketId=StartingTicketId;
 	   this.Tickettype=Type;
 	   Calendar cal=Calendar.getInstance();
 	   SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy HH:MM:SS");
 	   this.issueTime=sdf.format(cal.getTime());
 	   cal.add(Calendar.DAY_OF_YEAR, 1);
 	   this.expiryTime=sdf.format(cal.getTime());
 	   return ("\nTicket Id= "+TicketId+"\nTicket Type= "+Tickettype+"\nTicket Issue Time= "+issueTime+"\nTicket Expiry Time= "+
 	   expiryTime);
    }
}
