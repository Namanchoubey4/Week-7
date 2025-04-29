public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[i]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}