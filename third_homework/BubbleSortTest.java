import java.util.Arrays;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


public class BubbleSortTest {


    BubbleSort bub;
    int[] res;
    int[] data;
    int[] wrong;

    @Before
    public void setUp() {
        bub = new BubbleSort();
        res = new int[]{1,2,3,5,6};
        data = new int[]{1,6,3,2,5};
    }

    @Test
    public void testBubbleSort() {
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(bub.BubbleSort(data)));
    }

}
