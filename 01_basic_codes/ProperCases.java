import java.util.Scanner;

public class ProperCases {
    public static String ProperCaseCon(String fullName){
        String[] list = fullName.split(" "); //It splits the input string into words based on spaces
        String finalName = "";      // initialize finalName inside the method 
        for(String name: list){
            char singleChar = name.charAt(0);
            String temp = String.valueOf(singleChar).toUpperCase() + name.substring(1).toLowerCase();
            finalName += temp + " ";
        }
        return finalName.trim();  // Trim extra space at end 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String fullName =  sc.nextLine();

        //ProperCases obj = new ProperCases(); // create an object for proper case  (without static)
        //String result = obj.ProperCaseCon(fullName); // call the method (without static)
        String result = ProperCaseCon(fullName);
        System.out.println("proper Case: " + result);
        sc.close();
       
        
    }
    
}
