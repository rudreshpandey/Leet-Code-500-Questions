package interview;
import java.util.*;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder str = new StringBuilder();
        str.append(Long.toBinaryString(n));
        str.reverse();
        int len = str.length();
        int r = 32-len;
        while(r-->0){
            str.append("0");
        }
        Long num = Long.parseLong(str.toString(),2);
        System.out.println(num);

    }
}