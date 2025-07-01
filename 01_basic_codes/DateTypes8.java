import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTypes8 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, 10);
        System.out.println(c.getTime());
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(c.getTime()));
    }
}
