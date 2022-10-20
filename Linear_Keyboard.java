import java.util.Scanner;

public class Linear_Keyboard {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
		 String alpha=sc.next();
		 //System.out.println(alpha);
		 //sc.next();
		 String typeString=sc.next();
		 
		 int time=0;
		 int length=typeString.length();
		 
//		 System.out.println(typeString);
//		 System.out.println(length);
		 while(length-->1)
		 {
			 char ch=typeString.charAt(length);
			 int index = alpha.indexOf(ch);
			 char ch1=typeString.charAt(length-1);
			 int index1 = alpha.indexOf(ch1);
			 time += Math.abs(index1-index);
			 
		 }
		 System.out.println(time);
		 
	 }sc.close();
		

	}

}
