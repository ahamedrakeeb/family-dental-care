public class Doctor extends Staff
{
	protected int Doc_ID;
	protected String Doc_Password;

	public Doctor (int sID, String sname, String sad, String snic, int spno, float sal, int dID, String dPass)
	{
		super(sID, sname, sad, snic, spno, sal);
		Doc_ID = dID;
		Doc_Password = dPass;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Doctor ID: "+Doc_ID);
		System.out.println("Doctor Password: "+Doc_Password);
	}

	public void setPassword(String password)
	{
		Doc_Password = password;
	}

	public void setID(int id)
	{
		Doc_ID = id;
	}

	public int getID()
	{
		System.out.println("Doctor ID: ");
		return Doc_ID;
	}

	public String getPassword()
	{
		System.out.println("Doctor Password: ");
		return  Doc_Password;
	}
}// end Doctor