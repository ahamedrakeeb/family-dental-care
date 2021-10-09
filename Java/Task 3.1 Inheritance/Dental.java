public class Dental
{
	public static void main(String[] args) {
		
		Consultant c1 = new Consultant (010, "Dr.Srilal", "Colombo","854796321V", 775808754, 250000.0f, 0120, "lal1234", "MBBS", "University of bedfordshire", "England");
		OrdinaryDoctor od1 = new OrdinaryDoctor(011, "Dr. Jack", "Matale", "894234234V", 771452369, 550000.0f, 0121, "jack12", 8);
		od1.setSalary(120000.0f); 
		float f1 = od1.getSalary();
		System.out.println("New salary is "+f1);

		c1.setID(0100);
		c1.setPassword("hgsdb4");
		int id1 = c1.getID();
		System.out.println("New ID is "+id1);

		String qual1=c1.getQualification();
		String uni1=c1.getUniversity();
		String uniCountry1=c1.getUniversityCountry();
		String dPass1= c1.getPassword();
		System.out.println("New Password is "+dPass1);
		System.out.println("Qualification is "+qual1);
		System.out.println("Graduate at: "+uni1+" in "+uniCountry1);
		c1.showDetails();
		od1.showDetails();
	}
}// End main