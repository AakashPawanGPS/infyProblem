package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static int nDigits(int num){
        int number=1;
        for(int i=0;i<num;i++){
            number*=10;
        }
        return number;
    }

    public static void main(String[] args) {
	// write your code here
        int N,D,X;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        D= sc.nextInt();
        X=sc.nextInt();
        for(int i=nDigits(N-1);i<nDigits(N);i++){
            if (i % D == X) {
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
}
