public class OrdinaryDentists extends Doctor
{
	private int experience;

	public OrdinaryDentists(int stID,String ni, String na, String add, int contact, float sal, int dID, String dPass, int exp)
	{
		super(stID, ni, na, add, contact, sal, dID, dPass);
		experience = exp;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("The number of years of experience: "+experience);
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
