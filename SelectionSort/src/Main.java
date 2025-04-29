import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] arr = {7,8,3,1,2};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}