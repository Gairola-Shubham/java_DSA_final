package decision_making.loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("print a value");
        //int n = sc.nextInt();
        System.out.println("please enter the range");
        int range = sc.nextInt();
        boolean isPrime = false;
        for(int k=1; k<=range;k++){
            isPrime = false;
            for(int i=2; i<=Math.sqrt(k);i++){
                if(k%i==0){
                    isPrime = true;
                }
            }if(isPrime){
                System.out.println(k+"number is not prime");
            }else{
                System.out.println(k+"number is prime");
            }
        }
        
    }
}
