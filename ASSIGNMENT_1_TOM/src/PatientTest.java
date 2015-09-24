import java.util.Scanner;

public class PatientTest {

	public PatientTest() {
		
	}
	

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
		try{
		
		//USER INPUT+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		System.out.printf("Patient ID: ");
		int PatientId = Integer.parseInt(input.nextLine());
		
		System.out.printf("Enter your First Name: ");
		String FirstName = input.nextLine();

		System.out.printf("Enter your Last Name: ");
		String LastName = input.nextLine();
		
		System.out.printf("Enter your Address: ");
		String Address = input.nextLine();
		
		System.out.printf("Enter your City: ");
		String City = input.nextLine();
		
		System.out.printf("Enter your Province: ");
		String Province = input.nextLine();
		
		System.out.printf("Postal Code: ");
		String PostalCode = input.nextLine();
		
		//METHOD CALL++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		new Patient().getPatientInfo(PatientId, FirstName, LastName, Address, City, Province, PostalCode);
		
		}finally{
			input.close();
		}
			
	}

}
