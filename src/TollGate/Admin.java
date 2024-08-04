package TollGate;

public class Admin {
	int fare1=0;
	int revenue1=0;
	public Admin() {
		
	}
	public String IssueSmartCard(VehicleOwner vo, SmartCard s) {
		System.out.println(s.AssgnCard());
		if(vo.vehicleType.equalsIgnoreCase("car")) {
			fare1=1250;
		}
		if(vo.vehicleType.equalsIgnoreCase("bike")) {
			fare1=1000;
		}
		if(vo.vehicleType.equalsIgnoreCase("truck")|| vo.vehicleType.equalsIgnoreCase("bus")) {
			fare1=5000;
		}
		revenue1+=revenue1;
		return ("Fare for SmartCard = "+fare1);
	}
	public String RenewSmartCard(VehicleOwner vo, SmartCard s) {
		System.out.println(s.RenewCard());
		if(vo.vehicleType.equalsIgnoreCase("car")) {
			fare1=1250;
		}
		if(vo.vehicleType.equalsIgnoreCase("auto")) {
			fare1=1000;
		}
		if(vo.vehicleType.equalsIgnoreCase("truck")|| vo.vehicleType.equalsIgnoreCase("bus")) {
			fare1=5000;
		}
		revenue1+=revenue1;
		return ("Fare = "+fare1);
	}
	public String getRevenue(TollCollector tc,Admin a) {
		//tc.revenue = revenue1;
		return ("Revenue= "+tc.revenue);
	}
	public String getVehicleCount(VehicleOwner vo) {
		return ("Vehicle Count= "+vo.vehicleNumber);
	}
}
