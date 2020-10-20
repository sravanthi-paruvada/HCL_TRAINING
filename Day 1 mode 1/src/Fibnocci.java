
public class Fibnocci {
	public static void main(String args[])
	{
		int n1,n2,n3;
		n1=n2=1;
		for(int i=0;i<20;i++)
		{
			if(i<=1)
			{
				System.out.print(" "+1);
			}
				
			else
			{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			}
		}
		
	}

}
