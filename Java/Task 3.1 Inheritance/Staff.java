public abstract class Staff
{
	protected int staffID;
	protected String name;
	protected String address;
	protected String nicNo;
	protected int phoneNo;
	protected float salary;

	public Staff(int sID, String sname, String sad, String snic, int spno, float sal)
	{
		staffID = sID;
		name = sname;
		address = sad;
		nicNo = snic;
		phoneNo = spno;
		salary = sal;

	}
	
	public void showDetails()
	{
		System.out.println("Staff ID: "+staffID);
		System.out.println("Staff Name: "+name);
		System.out.println("Staff Address: "+address);
		System.out.println("Staff NIC No: "+ nicNo);
		System.out.println("Staff Phone No: "+phoneNo);
	}
	
	public void setSalary(float sal)
	{
		salary = sal;
	}
	
	public float getSalary()
	{
		return salary;
	}
}//end staff