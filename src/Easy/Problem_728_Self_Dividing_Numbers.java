package Easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_728_Self_Dividing_Numbers {
    //Language Java
    //Runtime 2ms
    //Memory 40.4MB
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isDividing(int n1){
        if(n1 <= 0)
            return false;
        int n = n1;
        while(n1 != 0){
            int res = 0;
            res = n1 % 10;
            if(res == 0 || n % res != 0){
                return false;
            }
            n1 /= 10;
        }
        return true;
    }
}