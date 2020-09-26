package JavaPrograms;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      App obj=new App();
        obj.displayDateAndTime();
    }
    public void displayDateAndTime()
    {
       int day, month, year,hours,minutes,seconds;
        GregorianCalendar gergcal= new GregorianCalendar();
        day=gergcal.get(Calendar.DAY_OF_MONTH);
        month=gergcal.get(Calendar.MONTH);
        year=gergcal.get(Calendar.YEAR);
        System.out.println(day+"/"+(month+1)+"/"+year);

        hours=gergcal.get(Calendar.HOUR);
        minutes=gergcal.get(Calendar.MINUTE);
        seconds=gergcal.get(Calendar.SECOND);

        System.out.println(hours+":"+minutes+":"+seconds);


    }

}
