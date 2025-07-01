public class String5{
    public static void main(String[] args) {
        String firstName = "shubh";
        //System.out.println(firstName.codeUnit); // all ascii value 
        System.out.println(firstName instanceof String);
        //System.out.println( "contains:" firstName.contains("h") );  // starts with, ends with , index of 
        String lastName = "gairo";
        String address = "lane-f, dehradun" ;
        var list = address.split(" ");
        System.out.println(list);
        //System.out.println(firstName.codeUnitAt(0)); //Ascii code 
        System.out.println(firstName + lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.isBlank());
        System.out.println(firstName.isEmpty());
        //String t = 'Helo" 'How' 'Are You';
        //System.out.println(t);
        // trim()

    }
}
