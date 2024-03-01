package Easy;

public class Problem_2413_Smallest_Even_Multiple {
    //Language Java
    //Runtime 0ms
    //Memory 40.3MB
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        else return n * 2;
    }
}
