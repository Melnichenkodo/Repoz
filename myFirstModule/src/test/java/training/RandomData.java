package training;

/**
 * Task VII.1
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomData {

    @Test
    public void main() {
        Random generate = new Random();
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(generate.nextInt(11) + 5);
        }

        Assert.assertEquals(listOfNumbers.size(), 10);

        Integer[] sortedList = new Integer[10];
        sortedList = listOfNumbers.toArray(sortedList);
        Arrays.sort(sortedList);
        for (Integer i = 0; i < sortedList.length; i++) {
            Assert.assertTrue(sortedList[i] <= sortedList[i++]);
            Assert.assertTrue(sortedList[i] >= 5 && sortedList[i] <= 15);
        }
    }
}
