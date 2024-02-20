package Easy;
public class Problem_231_Power_of_Two {
    //Language Java
    //Runtime 1ms
    //Memory 39.3MB
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 2!= 0) return false;
        return isPowerOfTwo(n/2);
    }
}
