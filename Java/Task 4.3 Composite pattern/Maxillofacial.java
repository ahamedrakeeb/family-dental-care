public class Maxillofacial extends Treatment
{
	private String maxilloType;
	private String treatmentType = "Maxillofacial Surgery";

	public Maxillofacial(int tid, float tc, String td, String maxtype)
	{
		super( tid, tc, td);
		maxilloType = maxtype;
	}

	public void showTreatmentDetails()
	{
		System.out.println("Treatment Type: "+treatmentType);
		System.out.println("Type of Maxillofacial : "+maxilloType);
	}
}// Maxillofacial