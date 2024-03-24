package Easy;

public class Problem_349_Intersection_of_Two_Arrays {
    //Language Java
    //Runtime 0ms
    //Memory 42.8MB
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] num3 = new int[1001];
        for (int i : nums1) {
            num3[i] = 1;
        }
        int count = 0;
        for (int i : nums2) {
            if (num3[i] == 1) {
                count++;
                num3[i] = 2;
            }
        }
        int arr[] = new int[count];
        int j = 0;
        for (int i : nums2) {
            if (num3[i] == 2) {
                num3[i] = 1;
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}