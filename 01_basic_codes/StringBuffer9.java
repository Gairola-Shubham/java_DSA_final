public class StringBuffer9 {
    public static void main(String[] args) {
        String name = "Shubh";
        name = name + "gairo";
        StringBuffer sc = new StringBuffer("shubh");
        System.out.println(sc.length()); //5
        System.out.println(sc.capacity()); // 16+5 = 21
        sc.append("gsgddffegfdfvefeggfe");
        System.out.println(sc.length());
        System.out.println(sc.capacity());
        // new cap = old cap * sizeofOne + Lastchar
        // = 20 * 2 + 2
    }
}