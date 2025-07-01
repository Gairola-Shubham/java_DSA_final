package decision_making.loops;

public class Q13_LCM {
    public static void main(String[] args) {
        int a = 24;
        int b = 42;
        int acpy = a;
        int bcpy = b;
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int LCM = (acpy * bcpy)/b;
        System.out.println("lcm " + LCM);
    }
    

}
