package TollGate;

public class TollManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Details of Vehicle Type:\n");
		VehicleOwner vo = new VehicleOwner("truck",12);
		TollCollector tc=new TollCollector();
		SmartCard sc=new SmartCard();
		Ticket t=new Ticket();
		Admin a=new Admin();
		
		String TicketIssued=tc.IssueTicket(vo, t, "return journey");
		String SmartCardIssued=a.IssueSmartCard(vo, sc);
		
		String revenue=a.getRevenue(tc, a);
		String vehiclecount=a.getVehicleCount(vo);
		System.out.println();
		System.out.println(TicketIssued);
		System.out.println();
		System.out.println(SmartCardIssued);
		System.out.println();
		System.out.println(revenue);
		System.out.println();
		System.out.println(vehiclecount);
		System.out.println();
	}

}


