package TollGate;

public class VehicleOwner {
	public String vehicleType;
    public int vehicleNumber;
    
    Ticket t = new Ticket();
    
    SmartCard s = new SmartCard();
    
    public VehicleOwner() {
    }
    
    public VehicleOwner(String vehicleType, int vehicleNumber) {
  	if(vehicleType.equalsIgnoreCase("car")||vehicleType.equalsIgnoreCase("auto")||vehicleType.equalsIgnoreCase("truck")||
  			vehicleType.equalsIgnoreCase("bus")) {
  	  this.vehicleType=vehicleType;
  	  this.vehicleNumber=vehicleNumber;
  	  this.t=null;
  	  this.s=null;
  	}
  	else {
  		System.out.println("Enter correct Vehicle Type");
  	}
    }
}
