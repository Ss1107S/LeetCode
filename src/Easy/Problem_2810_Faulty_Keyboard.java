package Easy;

public class Problem_2810_Faulty_Keyboard {
    //Language Java
    //Runtime 3ms
    //Memory 44.7_MB

    public String finalString(String s) {
        int n = s.length();
        StringBuilder reversedWord = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'i') {
                reversedWord.reverse();
            }else{
                reversedWord.append(s.charAt(i));
            }
        }
        return reversedWord.toString();
    }
}