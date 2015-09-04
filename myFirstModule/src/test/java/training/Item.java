package training;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Item {

    int[] array1 = new int[5];
    int[] array2 = new int[5];
    int[] array3 = new int[5];
    int[] array4 = new int[5];

    @Test
    public void main() {
        int position = 0;
        for (int i : array1) {
            array1[position] = position;
            position++;
        }

        Assert.assertEquals(array1[0], 0);
        Assert.assertEquals(array1[1], 1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }

        Assert.assertEquals(array2[4], 4);

        int j = 0;
        while (j < array3.length) {
            array3[j] = j;
            j++;
        }

        Assert.assertEquals(array3[4], 4);

        j = 0;
        do {
            array4[j] = j;
            j++;
        }
        while (j < array4.length);

        Assert.assertEquals(array4[4], 4);
    }


}

