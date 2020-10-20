import java.util.Scanner;

public class StudentAvg {
	public static void main(String args[]) {
		int sum=0,count=1;
		double avg=0;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of students");
	int num=scanner.nextInt();
	for(int i=1;i<=num;i++)
	{
		
	System.out.println("enter the grade of student"+i);
	int grade=scanner.nextInt();
	if(grade<=100)
		sum= sum+grade;
	else
		{
		System.out.println("Invalid grade");
		count=i;
		for(int j=count;j<=count;j++)
		{
			System.out.println("enter the grade of student"+j);
			grade=scanner.nextInt();
			if(grade<=100)
				sum= sum+grade;
		}
		}
	}
	
	avg = sum/num;
	System.out.println(avg);
	scanner.close();
	}

}
