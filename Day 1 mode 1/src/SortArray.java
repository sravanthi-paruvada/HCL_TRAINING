import java.util.Arrays;

public class SortArray {
	 
	public int[] assendingSort(int [] x){
		int temp=0;
		for(int i=0;i<x.length;i++)
		{  
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i] > x[j])
					{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					}
					
			}		
		}
		return x;
		}
	
	public int[] desSort(int [] x) {
		int temp=0;
		for(int i=0;i<x.length;i++)
		{  
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i] < x[j])
					{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					}
					
			}		
		}
		return x;
		
	}
	
	public int searchArray(int x[],int key) {
		for(int i=0;i<x.length;i++) {
			if(x[i]==key)
				return i;
		}
		return -1;
	}
	
	public int[] deletion(int x[],int key) {
		int pos=0;
		int z=0;
		z=x.length;
		for(int i=1;i<z;i++) {
			if(x[i]==key)
				pos=i;
		}
		for(int i=pos;i<z-1;i++) {
				x[i]=x[i+1];
	    
		}	return x;
	}
	
	public static void main(String args[])
	{
		int x[]= {2,4,1,6,3};
		//int z=x.length;
		int key = 3;
		 SortArray obj =new SortArray();
		 int k[] =obj.assendingSort(x);
		System.out.println( "Assending sort: "+Arrays.toString(k));
		int l[] =obj.desSort(x);
		System.out.println("Desending sort: "+Arrays.toString(l));
		
		int m =obj.searchArray(x,key);
		if(m>0)
		System.out.println("found at position: "+m);
		else
			System.out.println("not found");
		
		int n[]=obj.deletion(x,key);
		System.out.println("After deletion: "+Arrays.toString(n));
	          
		
		 
	}

	}


