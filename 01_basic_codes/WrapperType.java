public class WrapperType {
    public static void main(String[] args) {
        int x =10;
        Float w = 90.20f;
        Long w2 = 10000L;
        Character w3 ='A';
        System.out.println(Character.isAlphabetic('A'));
        char e = w3.charValue();
        System.out.println(w3.charValue());
        Integer y =220; // Boxing
        Integer z = 220;
        System.out.println(y==z);
        y++; //AutoBoxing(UnBoxing, Boxing) java 5
        System.out.println(y);
        System.out.println(y.toString());
        System.out.println(y.floatValue());  // xxxx.value provided by Integer
        System.out.println(y.longValue());
        System.out.println(y.byteValue());
        System.out.println(Integer.parseInt("9009"));
    }
}
