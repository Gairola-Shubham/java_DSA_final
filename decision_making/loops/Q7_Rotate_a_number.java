package decision_making.loops;

public class Q7_Rotate_a_number {
    public static void main(String[] args) {
        int num = 12345;
        int rot = -2;
        int count = 0;
        int cpy = num;
        while(cpy != 0){
            count ++;
            cpy /= 10;

        }
        rot = rot % count;
        if(rot<0){
            rot = rot + count;
        }
        int pow = (int)Math.pow(10, rot);
        int lhs = num / pow;
        int rhs = num % pow;
        //System.out.println(lhs);
        //System.out.println(rhs);
        int pow2 = (int)Math.pow(10, count-rot);
        int result = rhs * pow2 +lhs;
        System.out.println(result);
        
    }
}
