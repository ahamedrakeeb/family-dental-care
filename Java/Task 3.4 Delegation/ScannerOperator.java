public class ScannerOperator extends Role
{
	private String machineName;
	private int durationofoperation;

	public ScannerOperator(String mna, int dop)
	{
		machineName = mna;
		durationofoperation = dop;
	}	

	public void showDetails()
	{
		System.out.println("Machine :"+machineName);
		System.out.println("Operating Duration "+durationofoperation+" hours");
	}
}// Scanner Operator