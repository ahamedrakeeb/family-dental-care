public class Consultant extends Doctor
{
	private String qualification;
	private String university;
	private String uniCountry;

	public Consultant (int sID, String sname, String sad, String snic, int spno, float sal, int dID, String dPass, String qual, String uni, String uniCou)
	{
		super(sID, sname, sad, snic, spno, sal, dID, dPass);
		qualification = qual;
		university = uni;
		uniCountry = uniCou;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Qualification: "+qualification);
		System.out.println("Graduate University and Country: "+university+" in "+uniCountry);
	}

	public void setQualifications(String qual, String uni, String uniCou)
	{
		qualification = qual;
		university = uni;
		uniCountry = uniCou;
	}

	public String getQualification()
	{
		return qualification;
	}

	public String getUniversity()
	{
		return university;
	}

	public String getUniversityCountry()
	{
		return uniCountry;
	}
}// end Consultants