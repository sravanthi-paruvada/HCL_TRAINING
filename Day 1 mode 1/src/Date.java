import java.util.Scanner;

public class Date {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the day");
		int day=scanner.nextInt();
		System.out.println("enter the month");
		int m=scanner.nextInt();
		System.out.println("enter the year");
		int year=scanner.nextInt();
		
	int nextDay=0, nextMonth=0,nextYear=0,ndays = 0;
		for(m=1;m<=12;m++)
		{
		if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))
		ndays=31;
		else
			ndays=30;
		if(m==2)
		{
			if((year%400==0)||(year%100!=0)&&(year%4==0))
				ndays =29;
			else
					ndays=28;
		}
		
		}
		if(day>= ndays) {
			nextDay=1;
			nextMonth++;
		    if (nextMonth > 12) {
		      nextMonth = 1;
		     
		} nextYear= year+1;
		
		
		}
		System.out.println(nextDay+"/"+nextMonth+"/"+nextYear);
	
	scanner.close();
	}
}
