import java.util.Calendar;

public class Clock {

public static void main(String []args){

    long startTic = System.currentTimeMillis();

    Calendar cal = Calendar.getInstance();
    Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    int storedMin = t.getMinute();

    do {
        if (System.currentTimeMillis() - startTic >= 1000){
        t.tick();
        System.out.println(t.getSecond());
        startTic += 1000;
    }
    }
    while (t.getMinute() == storedMin);
    }
}
