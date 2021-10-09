public class RoomManagement
{
	public static void main(String[] args) {
		DentalSurgery d1 = new DentalSurgery("Family Dental Care (FDC)");
		Room r1 = new Room(1000, "Dr.Srilal", "Oral Aerosol Suction Vacum Pump Suction Unit");
		Room r2 = new Room(1100, "Dr.Jack", "Cleaning Filling Teeth Equipment");
		Room r3 = new Room(1200, "Dr.Shan", "Dental tooth implant machine");

		d1.addRoom(r1);
		d1.addRoom(r2);
		d1.addRoom(r3);

		d1.showSurgeryDetails();
	}
}

