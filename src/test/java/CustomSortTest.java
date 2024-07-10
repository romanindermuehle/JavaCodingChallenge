import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CustomSortTest {
    @Test
    public void bubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, CustomSort.bubbleSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10}, CustomSort.bubbleSort(new int[]{9, 8, 2, 3, 5, 7, 1, 4, 6, 10, 5}));
    }
}
