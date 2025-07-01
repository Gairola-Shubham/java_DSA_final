import java.math.BigInteger;

public class Large6 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("343343433433343232");
        BigInteger d = new BigInteger("34334343343334323234892829");
        BigInteger c = b.add(d);
        System.out.println(c);
        //int e = 100; //value type
        //Integer e2 = 100; //Ref type
        
        //float w = e2.floatValue(); //easy typeCasting 
        //int v = Integer.parseInt("1000"); // string to int 
        //float ww = 10.206f;
        //float w2 = new Float(10.20f);

        // integer pool can only keep 1 Byte range value(-128 to 127)
        Integer i = 127;
        Integer j = 127;
        //Integer k = new Integer(127);
        System.out.println(i == j);//true
        //System.out.println(i == k);//false
    }
}
