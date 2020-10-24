package day5.q1;

public class AccountTester {
	public static void main(String []args) {
		try {
			Account acc=new Account("Sri",10000);
			acc.withdraw(990);
			acc.deposite(1323);
		}
		catch(AccountCreationException ex){
			System.out.println(ex);
			
		}
		catch(NotSufficientFundException ex) {
			System.out.println(ex);
		}
		catch(OverFundException ex) {
			System.out.println(ex);
		}
		
	}

}
