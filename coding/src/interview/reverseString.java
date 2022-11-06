import java.util.Scanner;
public class reverseString {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in); 
	String str=sc.nextLine();
	sc.close();
	String rev_str="";
//	StringBuilder sb = new StringBuilder(str);
	int n=str.length();
	while(n-->0)
	{
		rev_str+=str.charAt(n);
	}
	System.out.println("Take-"+str+"\n"+rev_str);
	
}
}
