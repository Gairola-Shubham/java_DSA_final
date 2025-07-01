package inputs;
import java.util.Scanner;

public class scan0 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner("hello how are you\n hi this is text\n another text");
        int count = 0;
        // while(scanner.hasNext()){   // for words in a line 
        //     scanner.next();
        //     count++;
        //     //System.out.println(scanner.next());
        // }
        while (scanner.hasNextLine()) { 
            // for lines in a para 
            scanner.nextLine();
            count ++;
        }
        System.out.println("lines: " + count);
        scanner.close();
    }
}
