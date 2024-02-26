package Easy;

import java.math.BigInteger;

public class Problem_415_Add_Strings {
    //Language Java
    //Runtime 20ms
    //Memory 43.9MB
    public String addStrings(String num1, String num2) {
        return ((new BigInteger(num1)).add((new  BigInteger(num2)))).toString();
    }
}
