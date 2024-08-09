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

    public static int[] mergeSort(int[] numbers) {
        if (numbers.length <= 3) {
            return bubbleSort(numbers);
        }

        int middle = numbers.length >>> 1;

        int[] part1 = Arrays.copyOfRange(numbers, 0, middle);
        int[] part2 = Arrays.copyOfRange(numbers, middle, numbers.length);

        int[] sortedPart1 = mergeSort(part1);
        int[] sortedPart2 = mergeSort(part2);

        int[] result = merge(sortedPart1, sortedPart2);

        return result;
    }

    public static int[] merge(int[] a, int[] b) {
        int resultLenght = a.length + b.length;
        int[] result = new int[resultLenght];

        for (int resultIndex = 0, part1Index = 0, part2Index = 0; resultIndex < resultLenght; resultIndex++) {

//            if (part1Index > a.length) {
//                result.add(b[part2Index]);
//                part2Index++;
//            } else if (part2Index > b.length) {
//                result.add(a[part1Index]);
//                part1Index++;
//            } else if (a[part1Index] < b[part2Index]) {
//                result.add(a[part1Index]);
//                part1Index++;
//            } else {
//                result.add(b[part2Index]);
//                part2Index++;
//            }

            if (part2Index >= b.length || (part1Index < a.length && a[part1Index] < b[part2Index])) {
                result[resultIndex] = a[part1Index];
                part1Index++;
            } else {
                result[resultIndex] = b[part2Index];
                part2Index++;
            }
        }
        return result;
    }


    //TODO quickSort
}
