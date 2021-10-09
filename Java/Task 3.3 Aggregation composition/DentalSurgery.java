import java.util.Vector;
public class DentalSurgery
{
	private String dentalName;
	private Vector roomList;

	public DentalSurgery(String dNa)
	{
		dentalName = dNa;
		roomList = new Vector();
	}

	public void addRoom(Room r)
	{
		roomList.addElement(r);
	}

	public void showSurgeryDetails()
	{
		System.out.println("Surgery Name is: "+dentalName);
			int x = 0;
			while (x < roomList.size()) {
				Room y = (Room) roomList.elementAt(x);
				y.showDetails();
				x++;
			}
	}
}