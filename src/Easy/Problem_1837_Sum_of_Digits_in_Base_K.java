package Easy;

public class Problem_1837_Sum_of_Digits_in_Base_K {
    //Language Java
    //Runtime 30ms
    //Memory 40.5MB
    public int sumBase(int n, int k) {
        int sumBase=0;

        while(n >= 1){
            sumBase += n % k;
            n = n / k;
        }
        return sumBase;
    }
}
