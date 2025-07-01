package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sec {
    public static void main(String[] args)throws IOException {
       //int single = System.in.read();
    //    byte q[] = System.in.readAllBytes();
    //    System.out.println(q);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first Name");
        String Name = br.readLine();
        System.out.println("enter the id ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("ID " + id);
        System.out.println("Name " + Name);
        br.close();
    }
}
