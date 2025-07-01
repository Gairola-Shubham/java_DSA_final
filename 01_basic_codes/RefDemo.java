public class RefDemo {
    public static void main(String[] args) {
        //String name = "Amit";
        //String name2 = name;
        StringBuffer sb = new StringBuffer("amit");
        StringBuffer sb2 = sb;
        sb2.append("shri");
        System.out.println(sb);
        System.out.println(sb2);
    }
}
