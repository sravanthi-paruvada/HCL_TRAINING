
public class PascalTri {
	public static void main(String args[])
	{
		int x[][]= new int[5][5];
		//System.out.println(x.length);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
			   if((j==0)||(i==j))	
				   x[i][j]=1;
			   else
				   x[i][j] =x[i-1][j-1]+x[i-1][j];
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
  

}
