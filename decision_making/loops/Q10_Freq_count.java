package decision_making.loops;
import java.util.HashMap;

public class Q10_Freq_count {
    public static void main(String[] args) {
        int num = 5252528;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num != 0){
            int digit = num %10;
            if(map.get(digit) == null){ //get(key)
                map.put(digit,1); //put(key,value)
            }
            else{
                int count = map.get(digit);
                count ++;
                map.put(digit,count);
            }
            num = num / 10;
        }
        System.out.println(map);
    }
    
}
