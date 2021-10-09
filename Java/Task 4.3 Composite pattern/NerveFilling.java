public class NerveFilling extends Treatment
{
	private String procedure;
	private String treatmentType = "Nerve Filling";

	public NerveFilling(int tid, float tc, String td, String pd)
	{
		super( tid, tc, td);
		procedure = pd;
	}

	public  void showTreatmentDetails()
	{
		System.out.println("Treatment Type: "+treatmentType);
		System.out.println("Procedure : "+procedure);
	}
}// NerveFilling