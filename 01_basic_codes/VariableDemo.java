public class VariableDemo {
    public static void main(String[] args) {
        float saving_balance = 12222.31f;
        float savingBalance = 122222.32f;
        int id = 1001; // Explicit Way
        long timeInMs = 12333333333331L;
        int x2 = 10;
        id = id+100;

        var x = 10; // Implicit Way (Type inference) - java 10
        //x = "amit"; (will give error)
        x = 10;
        x++; // x=x+1
    }
    
}
