package training;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by 25032015 on 02.09.15.
 */
public class Lesson13 {

    @Test
    public void main(){
//        int i =123;
//        Integer j = 14;
//        Integer k = 15;
//        j=Integer.valueOf(k); //присвоили значение k для j, а не ссылку на тотже объект
//        System.out.println(j);


        List<String> workdays = new ArrayList<String>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");
//        for (String workday : workdays) {
//            System.out.println(workday);
//        }
//
//        workdays.toArray()
        System.out.println(workdays.indexOf("Wednesday")+1);


    }
}
