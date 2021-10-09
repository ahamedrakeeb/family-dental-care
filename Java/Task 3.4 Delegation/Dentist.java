public class Dentist
{
	private int ID;
	private String name;
	private String address;
	private String NIC;
	private String phoneNo;
	private Role r;

	public Dentist(int id, String na, String ad, String nic, String pno)
	{
		ID = id;
		name = na;
		address = ad;
		NIC = nic;
		phoneNo = pno;
	}
	
	public void setRole(Role r)
	{
		this.r = r;
	}

	public void showDetails()
	{
		System.out.println("Dentist ID : "+ID);
		System.out.println("Dentist Name : "+name);
		System.out.println("Dentist Address : "+address);
		System.out.println("Dentist NIC : "+NIC);
		System.out.println("Dentist Phone No : "+phoneNo);
		r.showDetails();
	}
}// Dentist