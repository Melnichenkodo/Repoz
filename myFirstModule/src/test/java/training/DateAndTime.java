package training;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Task VII.2
 */
public class DateAndTime {

    @Test
    public void main(){

        SimpleDateFormat currentDate = new SimpleDateFormat();
        currentDate.applyPattern("yy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        int daysCounter=0;

        while (!(currentDate.format(calendar.getTime()).equals("16/01/12"))){
            System.out.println(currentDate.format(calendar.getTime()));
            calendar.add(Calendar.DATE,1);
            daysCounter++;
        }
        System.out.println("Before my birthday "+daysCounter+" days left");

        Assert.assertEquals(daysCounter,127);

    }
}
