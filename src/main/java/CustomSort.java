import java.util.Arrays;

public class CustomSort {
    public static int[] bubbleSort(int[] numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }

    public static int[] quickSort(int[] numbers) {
        int[] result = Arrays.copyOf(numbers, numbers.length);



        return result;
    }
}
