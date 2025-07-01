package decision_making.loops;

public class Q6_Flip_Digit_with_pos {
    public static void main(String[] args) {
        int num = 32145;
        int pos = 0;
        int sum = 0;
        while(num != 0){
            int SingleDigit = num%10;
            pos ++;
            int pow = (int)Math.pow(10,SingleDigit-1);
            sum = sum + pos * pow;  
            num = num / 10; // MAKE NUMBER SMALL 
        }
        System.out.println(sum);
    }
}
