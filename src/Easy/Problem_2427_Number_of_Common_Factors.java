package Easy;

public class Problem_2427_Number_of_Common_Factors {
    //Language Java
    //Runtime 1ms
    //Memory 40.3MB
    public int commonFactors(int a, int b) {
        int count = 0;
        
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }
}
