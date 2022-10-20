import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Odd_Grasshopper {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int t = 1,s=2;
		 System.out.println(t&&s);
		 continue;
		 Queue<E> queue=new LinkedList<>();
		 while(t-->0)
		 {
			 long x = sc.nextLong();
			 long n = sc.nextLong();
			 //System.out.println(alpha);
			 //sc.next();
			 //System.out.println("x="+x+" n="+n);
			 long odd=0,even=n/2;
			 //System.out.println("odd="+odd+" even="+even);
			if((n&1)==0)
			{
				odd=even;
				
			}
			else {
				odd=even+1;
			}
			System.out.println("odd="+odd+" even="+even);
			long evenSum=even*(even+1);
			long oddSum=odd*odd;
			long dif=evenSum-oddSum;
			//System.out.println("dif= "+dif);
			long result=0;
			if((x&1)==0)
			{
				result=x+dif;
			}
			else {
				result=x-dif;
			}
		
			 System.out.println(result);
			 
		 }sc.close();
	}

}
