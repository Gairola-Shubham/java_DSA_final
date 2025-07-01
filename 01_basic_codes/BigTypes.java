import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1345324444444444444444444444444444444444444444441531");
        BigInteger b2 = new BigInteger("24444448888888888885633613563658665555555555444444444444444444444444444444454");
        BigInteger b3 = b.add(b2);
        System.out.println(b3);

        BigDecimal b4 = new BigDecimal("23453222224.56666666666");
    }
}
