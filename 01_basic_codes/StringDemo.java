public class StringDemo {
    public static void main(String[] args) {
        String name = "amit"; // String name = "amit".intern() // 1 object
        String name2 = "amit"; // 0 object
        String name3 = new String("amit").intern(); // 1 object
        String name4 = new String("ram");  // String made 2 or 1  // 1 object
        System.out.println(name==name2);
        System.out.println(name==name3);  // compare refrence
        System.out.println(name.equals(name2)); // compare name
    }
}
