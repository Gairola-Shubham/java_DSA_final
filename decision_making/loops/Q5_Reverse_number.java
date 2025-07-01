package decision_making.loops;

public class Q5_Reverse_number {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        while (num !=0) {
            int lastDigit = num %10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("reverse number " +rev);
        
    }
}
