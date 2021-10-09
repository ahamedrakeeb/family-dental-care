public class inchargedoc extends Role
{
	private String patientName;
	private String treatmentType;

	public inchargedoc(String ptna, String tt)
	{
		patientName = ptna;
		treatmentType = tt;
	}

	public void showDetails()
	{
		System.out.println("Patient Name : "+patientName);
		System.out.println("Treatment Type : "+treatmentType);
	}
}//inchargedoc