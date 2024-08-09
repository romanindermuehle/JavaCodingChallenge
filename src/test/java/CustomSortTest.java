import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class CustomSortTest {
    @Test
    public void bubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CustomSort.bubbleSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10}, CustomSort.bubbleSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10, 5}));
    }

    @Test
    public void mergeSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CustomSort.mergeSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10}, CustomSort.mergeSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10, 5}));
    }

    @Test
    public void merge() {
        assertArrayEquals(new int[]{2, 1, 3, 9, 10, 9}, CustomSort.merge(new int[]{2, 1, 3}, new int[]{9, 10, 9}));
    }

    @Test
    public void compareSortPerformance() {
        int[] values = new Random().ints(10000, 0,100).toArray();

        long t1 = System.nanoTime();
        CustomSort.bubbleSort(values);
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        CustomSort.mergeSort(values);
        long t4 = System.nanoTime();

        System.out.println("Bubble: " + TimeUnit.NANOSECONDS.toMillis(t2 - t1) + "ms");

        System.out.println("Merge: " + TimeUnit.NANOSECONDS.toMillis(t4 - t3) + "ms");
    }
}
