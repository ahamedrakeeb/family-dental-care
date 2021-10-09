import java.util.Vector;
public class ComplexTreatment extends Treatment
{
	private Vector treatmentList;

	public  ComplexTreatment(int tid,float tc, String td)
	{
		super( tid, tc, td);
		treatmentList = new Vector();
	}

	public void add(Treatment t) {
		treatmentList.addElement(t);
	}

	public void display()
	{
		System.out.println("Complex Treatment");
		int x = 0;
		while (x < treatmentList.size()) {
			Treatment t = (Treatment)treatmentList.elementAt(x);
			t.showTreatmentDetails();
			x++;
		}
	}// Show Treatment Details
}// ComplexTreatment