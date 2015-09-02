package training;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Arrays;

public class Array_page40 {

    @Test
    public void main() {
        int[] baseArray = {2, 5, 4, 3, 1};
        int[] secondArray = Arrays.copyOf(baseArray, 6);
        int[] thirdArray = Arrays.copyOfRange(secondArray, 0, 7);
        Arrays.sort(thirdArray);
        Assert.assertEquals(thirdArray.length, 7);
        Assert.assertEquals(thirdArray[0], 0);
        Assert.assertEquals(thirdArray[1], 0);
        Assert.assertEquals(thirdArray[2], 1);
        Assert.assertEquals(thirdArray[3], 2);
        Assert.assertEquals(thirdArray[4], 3);
        Assert.assertEquals(thirdArray[5], 4);
        Assert.assertEquals(thirdArray[6], 5);
        System.out.println(thirdArray[6]);

//Task 3

        String[] months = {"January", "March", "december", "may", "June", "august"};
        String[] finalMonths = new String[months.length + 1];
        Arrays.fill(finalMonths, 0, 1, "APRIL");

        for (int i = 0; i < months.length; i++) {
            Arrays.fill(finalMonths, i + 1, i + 2, months[i].toUpperCase());
        }

        Arrays.sort(finalMonths);

    }
}
