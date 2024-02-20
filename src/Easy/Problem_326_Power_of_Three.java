package Easy;

public class Problem_326_Power_of_Three {
    //Language Java
    //Runtime 8ms
    //Memory 42.5MB
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 3!= 0) return false;
        return isPowerOfThree(n/3);
    }
}