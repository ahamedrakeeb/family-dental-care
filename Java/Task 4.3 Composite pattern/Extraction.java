public class Extraction extends Treatment
{
	private int extractionNo;
	private String painKiller;
	private String treatmentType = "Extraction of Tooth";

	public Extraction(int tid, float tc, String td, int exNo, String pk)
	{
		super( tid, tc, td);
		extractionNo = exNo;
		painKiller = pk;
	}

	public void showTreatmentDetails()
	{
		System.out.println("Treatment Type : "+treatmentType);
		System.out.println("Extraction No : "+extractionNo);
		System.out.println("Pain Killer : "+painKiller);
	}
}// Extraction