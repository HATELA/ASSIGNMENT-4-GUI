
public class BankAccount 
{
	
	//INSTANCE VARIABLES++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String accountNumber = "NM4542D455DF451G4GF";
	public String ownersName = "TOM PSILIOPOLOUS";
	public double balance = 9000000.50;
	public double withdraw;
	public double deposit;
	public double rBalance =0;
    //PROPERTIES+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnersname() {
		return ownersName;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	//DEPOSITS AND WITHDRAWALS++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public double sumDeposits()
	{
	    rBalance = balance + deposit;
	    return rBalance;
	}
	public double sumWithdrawals()
	{
	   rBalance = rBalance - withdraw;
		return rBalance;
	}

	//CONSTRUCTOR+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public BankAccount(String AccountNumber, String OwnersName,double Balance,double Deposit,double Withdraw, double rBalance)
	{
		this.accountNumber = AccountNumber;
	    this.ownersName = OwnersName;
	    this.balance = Balance;
	    this.deposit = Deposit;
	    this.withdraw = Withdraw;
	    this.rBalance = rBalance;
	}
	
	//METHOD GETACCOUNTINFO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void getAccountInfo()
	{
		System.out.printf("Hi Tom, What do you want to do:"+"%n AccountNumber: "+this.accountNumber+"%n OwnersName: "+this.ownersName+"%n Balance: "+this.balance+"%n Deposit:"+this.deposit+"%n Withdraw"+ this.withdraw+"%n YOUR REMAINING BALANCE IS:"+this.rBalance	);
	}

}
