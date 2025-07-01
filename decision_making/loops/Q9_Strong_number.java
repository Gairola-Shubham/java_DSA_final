package decision_making.loops;

public class Q9_Strong_number {
    static int fact(int Digit){
        int result = 1;
        while(Digit>1){
            result = result * Digit;
            Digit --;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 145;
        int cpy = num;
        int sum = 0;
        while(cpy != 0){
            int Digit = cpy %10;
            sum = sum + fact(Digit);
            cpy = cpy/10;
        }
        System.out.println(num == sum? "Strong number" : "not a strong number");
    }
}