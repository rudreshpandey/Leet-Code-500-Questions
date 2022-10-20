import java.util.Scanner;

public class PalindromicPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int last=i;
			for(int j=m;j>=1;j--)
			{
				if(last==j) 
				{
					System.out.print("*");last--;
				}
				else System.out.print(" ");
				
				System.out.print(" ");
				
		
			}
			last =i;
			
			for(int j=2;j<=m;j++)
			{
				if(last>=j) System.out.print("*");
				else System.out.print(" ");
				
				System.out.print(" ");
				
			}
			
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			int last=i;
			for(int j=m;j>=1;j--)
			{
				if(last==j) 
				{
					System.out.print("*");last--;
				}
				else System.out.print(" ");
				
				System.out.print(" ");
				
		
			}
			last =i;
			
			for(int j=2;j<=m;j++)
			{
				if(last>=j) System.out.print("*");
				else System.out.print(" ");
				
				System.out.print(" ");
				
			}
			
			System.out.println();
		}

	}

}
