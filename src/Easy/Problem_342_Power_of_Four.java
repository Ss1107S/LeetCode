package Easy;

public class Problem_342_Power_of_Four {
    //Language Java
    //Runtime 1ms
    //Memory 39.6MB
    public boolean isPowerOfFour(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return isPowerOfFour(n/4);
    }
}
