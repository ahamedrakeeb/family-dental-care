public class FDC
{
	public static void main(String[] args) {
		Dentist d1 = new Dentist( 0100,"Dr.Lal", "Galle","95478563v", "775896321");
		inchargedoc pt1 = new inchargedoc("Jack","Dental Implantation");
		ScannerOperator so1 = new ScannerOperator("Scanner 14587", 8);

		d1.setRole(pt1);
		d1.showDetails();

		System.out.println("");
		System.out.println("Dentist Current Role");
		System.out.println("");

		d1.setRole(so1);
		d1.showDetails();
	}
}// End main 

