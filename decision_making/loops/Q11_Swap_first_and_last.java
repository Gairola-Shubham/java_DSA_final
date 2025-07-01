package decision_making.loops;

public class Q11_Swap_first_and_last {
    public static void main(String[] args) {
        int num = 9246;
        int cpy = num;
        int count = 0;
        while(cpy != 0){
            count ++;
            cpy = cpy/10;
        }
        int pow = (int)Math.pow(10,count-1);
        int lastdigit = num%10;
        int firstdigit = num/pow;
        num = num/10;
        int pow2 = (int) Math.pow(10,count -2);
        int middleNumber = num%pow2;
        int result = lastdigit * pow + middleNumber * 10 + firstdigit;
        System.out.println(result);
        // System.out.println(pow2);
        // System.out.println(num%pow2);
        // System.out.println(lastdigit);
        // System.out.println(firstdigit);
        
    }
}
