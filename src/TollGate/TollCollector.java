package TollGate;

public class TollCollector {
	public int fare=0;
    public int revenue=0;
    public int vehicleCount=0;
    
    public TollCollector() {
  	  
    }
    
    public String IssueTicket(VehicleOwner vo,Ticket t,String Type) {
  	  System.out.println(t.AssgnTicket(Type));
  	  if(vo.vehicleType.equalsIgnoreCase("car")) {
  		  if(Type.equalsIgnoreCase("single Journey")) {
  			  fare=50;
  		  }
  		  if(Type.equalsIgnoreCase("Return Journey")) {
  			  fare=75;
  		  }
  		  if(Type.equalsIgnoreCase("montly Pass")) {
  			  fare=1705;
  		  }
  	  }
  	  if(vo.vehicleType.equalsIgnoreCase("auto")) {
  		  if(Type.equalsIgnoreCase("single Journey")) {
  			  fare=85;
  		  }
  		  if(Type.equalsIgnoreCase("Return Journey")) {
  			  fare=195;
  		  }
  		  if(Type.equalsIgnoreCase("montly Pass")) {
  			  fare=2760;
  		  }
  	  }
  	  if(vo.vehicleType.equalsIgnoreCase("Truck")|| (vo.vehicleType.equalsIgnoreCase("bus"))) {
  		  if(Type.equalsIgnoreCase("single Journey")) {
  			  fare=175;
  		  }
  		  if(Type.equalsIgnoreCase("Return Journey")) {
  			  fare=260;
  		  }
  		  if(Type.equalsIgnoreCase("montly Pass")) {
  			  fare=5780;
  		  }
  	  }
  	  revenue+=fare;
  	  vehicleCount++;
  	  return ("Fare for Journey= "+fare);
    }
}
