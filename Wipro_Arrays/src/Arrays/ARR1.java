package Arrays;

public class ARR1 {
	public static void main(String args[]) {
		int[] x=new int[5];
		int i,sum=0,avg;
		for(i=0;i<x.length;i++)
		{
			x[i]=i;
			sum=sum+x[i];
		}
		avg = sum/x.length;
		System.out.println("sum and avg is:"+sum+" "+avg);
		
	}

}
