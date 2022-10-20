import java.util.Scanner;

public class Zig_Zag_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dif=4;
		//int init=2;
		for(int i=2;i>=0;i--)
		{
			int init=i;
			if(init==1) dif=2;
			else dif=4;
			for(int j=0;j<n;j++)
			{
				if(init==j)
				{
					System.out.print("*");
					init+=dif;
				}
				else
				{
					System.out.print(" ");
				}System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
