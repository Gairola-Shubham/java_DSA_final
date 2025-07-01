package decision_making.loops;
import java.util.Scanner;


public class Q12_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // // Division method
        // while(a%b!=0){
        //     int rem = a%b;
        //     a = b;
        //     b = rem;
        // }
        
        // System.out.println("GCD " +b);
        
        // Subtraction method
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        System.out.println("gcd " +a);
        
        // int min = a>b?b:a;
        // while(min!=0){
        //     if(a%min==0 && b%min==0){
        //         System.out.println("GCD: " + min);
        //         break;
        //     }
        //     min--;
        // }
    }
    
}
