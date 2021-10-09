public class OrdinaryDoctor extends Doctor
{
	private int experience;

	public OrdinaryDoctor(int sID, String sname, String sad, String snic, int spno, float sal, int dID, String dPass, int exp)
	{
		super(sID, sname, sad, snic, spno, sal, dID, dPass);
		experience = exp;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Years of experience: "+experience);
	}

	public void setExperience(int exp)
	{
		experience = exp;
	}

	public int getExperience()
	{
		return experience;
	}
}// end Ordinary Dentists
