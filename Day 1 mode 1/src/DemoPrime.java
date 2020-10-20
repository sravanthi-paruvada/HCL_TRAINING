import java.util.Scanner;

public class DemoPrime {
	 public static void main(String args[])
	 {
		 System.out.println("enter the num");
		 
		 Scanner scanner = new Scanner(System.in);
		 int num = scanner.nextInt();
		 int count=0;
		 if(num>1)
		  { 
			 boolean isPrime =false;
			  for(int i=2; i<=7; i++)
			  {
				  if(num%i==0)
				  {
					  isPrime=true;
					  count++;
					  break;
				  }
				  
				  
			  }
				    
			  if(isPrime==true)
					  System.out.println(" num is prime");
				  else
					  System.out.println("num is not Prime");
					  
					  
			  }
		 System.out.println(count);
		 
	 scanner.close();
	 }
		 
	 }


