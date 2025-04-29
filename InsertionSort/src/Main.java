import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 7, 4, 2, 3, 6, 1, 0};
        InsertionClass.insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}