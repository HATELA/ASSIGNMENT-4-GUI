import java.util.Scanner;
public class BankAccountTest {

	public static void main(String[] args)
	{
		    Scanner input = new Scanner(System.in);
		try{
			String AccountNumber="M5654454S645D55F454545";
			String OwnersName ="TOM PSILIOPOLOUS";
			double Balance = 9000;
			double rBalance = 0;
		
		
		
		//USER INPUT++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println("Enter the amount you want to deposit:");
		double Deposit =Double.parseDouble(input.nextLine());
			
		System.out.println("Enter the amount you want to withdraw:");
		double Withdraw =Double.parseDouble(input.nextLine());
		
		//OBJECTS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		BankAccount  B1 = new BankAccount(AccountNumber, OwnersName, Balance, Deposit, Withdraw,  rBalance);
		B1.sumDeposits();
		B1.sumWithdrawals();
		B1.getAccountInfo();
		
		}finally{
			input.close();
		}
		
       		
		
		
		
		
	}

}
