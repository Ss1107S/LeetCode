package Easy;

public class Problem_1952_Three_Divisors {
    //Language Java
    //Runtime 1ms
    //Memory 40.6MB
    public boolean isThree(int n) {
        int x = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                x++;
            }
        }
        if(x == 3){
            return true;
        }
        return false;
    }
}