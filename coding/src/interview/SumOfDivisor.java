package interview;
//Given a positive integer N., The task is to find the value of    \sum_{i=1}^{i=n} F(i)  where function F(i) for the number i be defined as the sum of all divisors of ‘i‘.
public class SumOfDivisor {
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i =1;i<=N;i++){
            sum += (N/i)*i;
        }
        return sum;
    }
}