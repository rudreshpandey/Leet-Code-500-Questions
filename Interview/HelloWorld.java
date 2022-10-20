//package Interview;

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int sizeA = sc.nextInt();
           int sizeB = sc.nextInt();
           String binaryA = sc.next();
           String binaryB = sc.next();
//           String binaryA = Integer.toBinaryString(a);
//           String binaryB = Integer.toBinaryString(b);
//           int sizeA = binaryA.length();
//           int sizeB = binaryB.length();
           //System.out.println("sizeA "+binaryA+" "+binaryB);
           while(sizeA>=2){
        	   //System.out.println(sizeA+" "+binaryA);
        	   char ch = binaryB.charAt(0);
               if(ch=='1'){
                   char ch1 = binaryA.charAt(0);
                   char ch2 = binaryA.charAt(1);
                   int a1 = ch1=='1'?1:0;
                   int a2 = ch2=='1'?1:0;
                   //System.out.println("sizeA "+a1+" "+a2);
                   int max = Math.max(a1,a2);
                   //System.out.println("max "+(char)max);
                   binaryA = (max == 0?"0":"1") +  binaryA.substring(2);
                   //System.out.println(sizeA+"**"+binaryA);
                   if(binaryA.equals(binaryB)){
                       
                       break;
                   } 
                   
               }else{
            	   int a1 = Integer.parseInt(String.valueOf(binaryA.charAt(0)));
                   int a2 = Integer.parseInt(String.valueOf(binaryA.charAt(1)));
                   int min = Math.min(a1,a2);
                   binaryA = (min == 0?"0":"1") +  binaryA.substring(2);
                   if(binaryA.equals(binaryB)){
                       
                       break;
                   } 
                   
                   
            	   
               }
               sizeA= binaryA.length();
           }
           if(binaryA.equals(binaryB)) System.out.println("Yes");
           else System.out.println("No");
                   
           
           
       }
    }
}
