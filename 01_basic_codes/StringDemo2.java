public class StringDemo2 {
    public static void main(String[] args) {
        // // java 1.5
        // StringBuilder sql = new StringBuilder("Select * from users");
        // synchronized(sql){
        //     sql.append( "where userid = 'shubh'and pass='111' ");
        // }
        
        // sql.append("and status = 'A' ");

        StringBuilder sb = new StringBuilder(); // 16
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Hello, how are yougdfvdxcvdbfxzfcv sdsf");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("ok");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
    }
}
