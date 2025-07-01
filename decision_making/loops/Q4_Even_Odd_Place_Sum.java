package decision_making.loops;

public class Q4_Even_Odd_Place_Sum {
    public static void main(String[] args) {
        int num = 8765;
        int pos = 0;
        int oddSum = 0;
        int evenSum = 0;
        while(num != 0){
            int lastDigit = num %10;
            pos++;
            if(pos%2==0){
                evenSum = evenSum + lastDigit;
            }
            else{
                oddSum = oddSum + lastDigit;
            }
            num = num/10;
        }
        System.out.println("even position sum "+evenSum);    
        System.out.println("odd position sum "+oddSum);    

    }
}
