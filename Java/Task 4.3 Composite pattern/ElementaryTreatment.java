public class ElementaryTreatment
{
	public static void main(String[] args) {
		Extraction e1 = new Extraction( 010, 5236.0f, "2019.07.11",1, "Nerve Filling");
		NerveFilling nf1 = new NerveFilling( 011, 8523.0f,"2019.02.09", "Cleaning and Bleaching");
		Maxillofacial mo1 = new Maxillofacial( 013, 50000.0f,"2019.06.17", "Flunarizine");
		Implantation i1 = new Implantation( 015, 45698.0f, "2019.05.25", "Paracetamol");
		ComplexTreatment ct1 = new ComplexTreatment(0,0,null);
		
		ct1.add(e1);
		ct1.add(nf1);
		ct1.add(mo1);
		ct1.add(i1);

		e1.showTreatmentDetails();
		nf1.showTreatmentDetails();
		mo1.showTreatmentDetails();
		i1.showTreatmentDetails();

		ct1.display();
	}
}