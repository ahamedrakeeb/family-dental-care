public abstract class Treatment
{
	private int treatmentID;
	private float treatmentCost;
	private String tDate;

	public Treatment(int tid, float tc, String td)
	{
		treatmentID = tid;
		treatmentCost = tc;
		tDate = td;
	}

	public void showTreatmentDetails()
	{
		System.out.println("Treatment ID : "+treatmentID);
		System.out.println("Treatment cost : "+treatmentCost);
		System.out.println("Date : "+ tDate);
	}
}// Treatment
