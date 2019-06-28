package Arrays;

public class ARRA2 {
	public static void main(String args[]) {
		int[] x= {1,14,26,37,48,58,64,74,86,97};
		int i,min=99,max=0;
		for(i=0;i<x.length;i++)
		{
			if(min>x[i])
				min=x[i];
			if(max<x[i])
				max=x[i];
		}
			System.out.println("Max and Min values in given arrays is:"+max+" "+min);
			}

}
