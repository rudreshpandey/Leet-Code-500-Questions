package interview;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder build = new StringBuilder();
         build.append(Integer.toString(n));
         String original = build.toString();
         String reverse = build.reverse().toString();
         //return reverse.equals(original)?"Yes":"No";
         System.out.println(original+" "+reverse);
         System.out.println(original.equals(reverse));
    }
    
}