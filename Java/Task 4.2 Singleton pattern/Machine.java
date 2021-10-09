import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Machine
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sNo = 0;
		String mk = "";
		String oc = "";
		float cos = 0;
		
		int x = 0;
		while (x<2){
			System.out.print("Enter Serial No: ");
			sNo = Integer.parseInt(br.readLine());
			System.out.print("Enter Production Company Name: ");
			mk = br.readLine();
			System.out.print("Enter Origin Country: ");
			oc = br.readLine();
			System.out.print("Enter Price: ");
			cos = Float.parseFloat(br.readLine());
			System.out.println("Machiery Successfully Added.");

			Scanner s1 = Scanner.getScanner(sNo, mk, oc, cos);
			s1.showDetails();
			x++;
		}
	}// end main
}// end Machine