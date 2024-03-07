package Easy;

import java.math.BigInteger;

public class Problem_415_Add_Strings {
    //Language Java
    //Runtime 1ms
    //Memory 42.5MB
    public String addStrings(String num1, String num2) {
        StringBuilder count = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

        while (i >= 0 || j >= 0 || carry > 0){
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            sum = digit1 + digit2 + carry;
            count.append(sum % 10);
            carry = sum / 10;
        }
        return count.reverse().toString();
    }
}
