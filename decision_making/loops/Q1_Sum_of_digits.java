package decision_making.loops;

public class Q1_Sum_of_digits{
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while(num != 0){
            int lastDigit = num%10;
            sum = sum + lastDigit;
            num = num/10;
        }
        System.out.println(sum);
         
    }
}