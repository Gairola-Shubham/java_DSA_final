package decision_making.loops;

public class Q3_Prime_numbers {
    public static void main(String[] args) {
        // // approch 1
        // int num = 997;
        // int count = 0;
        // for(int i = 1; i<=num; i++){
        //     if(num % i == 0){ 
        //         count++;
        //     }
        // }
        // System.out.println(count==2?"prime number":"not a prime number");
    
        // approch 2    
        // int num = 997;
        // int count = 0;
        // for(int i = 2; i<num; i++){
        //     if(num % i == 0){
        //         System.out.println("not a prime number");
        //         return;
        //     }
        // }
        // System.out.println("prime number");
        
        
        int num = 64;
        int count = 0;
        for(int i = 2; i<=Math.sqrt(num); i++){   // for(int i = 2; i*i<=num; i++) (if maths.sqrt can not be used)
            if(num % i == 0){
                System.out.println("not a prime number");
                return;
            }
        }
        System.out.println("prime number"); 
    
    }
}
