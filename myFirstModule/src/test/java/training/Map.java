package training;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Task V.4 Map
 */
public class Map {

    @Test
    public void main() {
        int[] keys = {4, 5, 3, 7, 2, 9, 2};
        String[] values = {"Dog", "Cat", "Tiger", "Wolf", "Chicken", "Frog", "Parrot"};
        HashMap<Integer, String> animals = new HashMap<Integer, String>();
        for (int i = 0; i < 7; i++) {
            animals.put(keys[i], values[i]);
        }

        Assert.assertEquals(animals.size(), 6);
        System.out.println((animals.keySet()));
        Assert.assertEquals(animals.get(2), "Parrot");
        System.out.println(animals.entrySet());

    }
}
