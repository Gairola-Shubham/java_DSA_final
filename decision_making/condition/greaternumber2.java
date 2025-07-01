package decision_making.condition;

public class greaternumber2 {
    public static void main(String[] args) {
        int first = 100;
        int second = 200;
        int third = 3000;
        int fourth = 400;
        if (first>second) {
            if(first>third){
                if (first>fourth) {
                    System.out.println("first number is greater");
                }
                else{
                    System.out.println("fourth is greater");
                }
            }
            else{
                if(third>fourth){
                    System.out.println("third is greater");
                }
                else{
                    System.out.println("fourth us greater");
                }
            }
        }
        else{
            if(second>third){
                if(second>fourth){
                    System.out.println("Second is greater");
                }
                else{
                    System.out.println("fourth is greater");
                }
            }
            else{
                if(third>fourth){
                    System.out.println("third is greater ");
                }
                else{
                    System.out.println("fourth is greater ");
                }
            }
        }
    }
}
