public class Room
{
	private int roomNo;
	private String inchargeDoctor;
	private String equipmentName;

	public Room(int rNo, String incdoc, String equip)
	{
		roomNo = rNo;
		inchargeDoctor = incdoc;
		equipmentName = equip;
	}

	public void showDetails()
	{
		System.out.println("Room No: "+roomNo);
		System.out.println("The doctor incharge : "+inchargeDoctor);
		System.out.println("The equipments used: "+equipmentName);
	}

	public void setDoctor(String incdoc)
	{
		inchargeDoctor = incdoc;
	}
}