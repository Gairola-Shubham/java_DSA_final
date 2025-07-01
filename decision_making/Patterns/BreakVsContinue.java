package decision_making.Patterns;

public class BreakVsContinue {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                if(i==j){
                    return; // exit from the function
                    //continue; // continue - exit from the current iteration
                    //break; // break - exit from the current loop
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
