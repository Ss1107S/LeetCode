package Easy;

public class Problem_367_Valid_Perfect_Square {
    //Language Java
    //Runtime 0ms
    //Memory 39.9MB
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        int x = (int) n;

        if((x * x) == num) return true;
        return false;
    }
}