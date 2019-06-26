package javafortesters;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Calendar;


public class DateTimesTest {

//    Re-write the millisecond @Test method shown above using nanoTime and see the difference in output.

    @Test
    public void test() {

        long startTime = System.currentTimeMillis();
        long nanoStartTime = System.nanoTime();
        System.out.println(startTime);
        System.out.print(nanoStartTime);
    }

//Write an @Test method which instantiates a Calendar object and writes the output of toString to the console
//Use a Calendar set to 15th December 2018, at 23:49 and 54 seconds.
    @Test
    public void calendarObjectToStringToTheConsole()
    {
        Calendar objectCalendar = Calendar.getInstance();
        System.out.println(objectCalendar.toString());
        System.out.println(objectCalendar.get(Calendar.MONTH));

    }
    @Test
    public void checkCalendarValues()
    {
        Calendar objectCalendar = Calendar.getInstance();
        objectCalendar.set(2018,11,15,11,49,54);
        Assert.assertEquals(objectCalendar.get(Calendar.YEAR),2018);
        Assert.assertEquals(objectCalendar.get(Calendar.MONTH), 11);
        Assert.assertEquals(objectCalendar.get(Calendar.DATE),15);
        Assert.assertEquals(objectCalendar.get(Calendar.HOUR_OF_DAY),11);
        Assert.assertEquals(objectCalendar.get(Calendar.MINUTE),49);
        Assert.assertEquals(objectCalendar.get(Calendar.SECOND),54);
        System.out.println(objectCalendar.toString());
    }


}
