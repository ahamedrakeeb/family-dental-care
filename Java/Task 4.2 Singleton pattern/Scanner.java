public class Scanner
{
	private int serialNo;
	private String make;
	private String originConutry;
	private float cost;
	private static int count = 0;

	private Scanner(int sNo, String mk, String oc, float cos)
	{
		serialNo = sNo;
		make = mk;
		originConutry = oc;
		cost = cos;
	}

	public static Scanner getScanner(int sNo, String mk, String oc, float cos)
	{
		if (count==0) {
			Scanner s1 = new Scanner( sNo, mk, oc, cos);
				count ++;
				return s1;
		}
		else {
			System.out.println("Sorry. You cannot add more Scanner Machines.");
				return null;
		}
	}

	public void showDetails()
	{
		System.out.println("Serial No: "+serialNo);
		System.out.println("Production Company: "+make);
		System.out.println("Made in: "+originConutry);
		System.out.println("Price: "+cost+"$");
	}
}// End Scanner

