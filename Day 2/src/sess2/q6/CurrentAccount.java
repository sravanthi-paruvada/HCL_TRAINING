package sess2.q6;

public class CurrentAccount extends Account{
	double tradeLicenseNumber;
	double accountBalance1;
	public CurrentAccount(String name, double accountBalance,double tradeLicenseNumber) {
		super(name, accountBalance);
		this.tradeLicenseNumber=tradeLicenseNumber;
		
	}
	
public double getBalance(double  accountBalance) {
		
		return accountBalance+accountBalance*(5/100);
	}
	public double withdraw(double withdrawAmount) {
		if(withdrawAmount<=accountBalance )
		accountBalance1 = accountBalance -withdrawAmount;
		return accountBalance1;
	  
	}

	
	

}
