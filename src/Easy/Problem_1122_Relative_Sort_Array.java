package Easy;

public class Problem_1122_Relative_Sort_Array {
    //Language Java
    //Runtime 0ms
    //Memory 41.5MB
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr = new int [1001];
        for (int n : arr1) arr[n]++;
        int i = 0;
        for(int n : arr2){
            while (arr[n] --> 0){
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < arr.length; n++) {
            while(arr[n] --> 0){
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}