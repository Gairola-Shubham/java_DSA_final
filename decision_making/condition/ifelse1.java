package decision_making.condition;

public class ifelse1 {
    public static void main(String[] args) {
        int num = 30;
        if (num%2==0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        if((num^1) == num+1){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        if((num&1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        // if((num|1) == num+1){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
        if((num|1) > num){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
