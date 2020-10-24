package day5.q1;

public class Account {
	private int id;
	private String name;
	private int balance;
private static int accountCounter=0;
	
	
	public Account( String name, int balance) throws AccountCreationException {
		if(balance<1000)
			throw new AccountCreationException("Account cannot be created");
		
		this.id = ++accountCounter;
		this.name = name;
		this.balance = balance;
	}



	public void withdraw(int amount)throws NotSufficientFundException{
		int tempBal=balance-amount;
		if(tempBal<1000)
			throw new NotSufficientFundException("not enough fund");
		balance=tempBal;
		System.out.println("withdraw complete. remaining balance : "+balance);
	}

	public void deposite(int amount)throws NotSufficientFundException,OverFundException{
		
		if(amount>100000)
			throw new OverFundException(" fund exceeded the limit to deposite");
		int tempBal=balance+amount;
		balance=tempBal;
		System.out.println("deposite complete. remaining balance : "+balance);
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
	
	
}
