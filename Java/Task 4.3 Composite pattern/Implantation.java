public class Implantation extends Treatment
{
	private String implantType;
	private String treatmentType = "Dental Implantation";

	public Implantation(int tid, float tc, String td, String impl)
	{
		super(tid, tc, td);
		implantType = impl;
	}

	public void showTreatmentDetails()
	{
		System.out.println("Treatment Type: "+treatmentType);
		System.out.println("Type of Implantation : "+implantType);
	}
}// Implantation