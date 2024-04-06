package Easy;

public class Problem_326_Power_of_Three {
    //Language Java
    //Runtime 8ms
    //Memory 44.2MB
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n % 3 != 0 || n == 0) return false;
        return isPowerOfThree(n / 3);
    }
}