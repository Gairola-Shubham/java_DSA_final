import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Date;

public class WrapperTypes7 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 200;
        String str = b.toString();
        System.out.println("String" +str);
        System.out.println(Integer.toBinaryString(a));
        Float e = 90.30f;
        Double t = 999.235;
        Boolean att = true;
        Character singleChar = 'A';
        System.out.println(Character.isLowerCase('A'));
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        BigInteger x= new BigInteger("4584668444444444444444444444444444415488");
        BigInteger y= new BigInteger("4584668444444444444555555555555544444415488");
        BigInteger z = x.add(y);
        System.out.println(z);
        Date d = new Date();
        System.out.println("date is: " + d);
    }
}