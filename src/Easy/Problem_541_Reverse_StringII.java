package Easy;

public class Problem_541_Reverse_StringII {
    //Language Java
    //Runtime 1ms
    //Memory 43.9MB
    public String reverseStr(String s, int k) {
        char[] words = s.toCharArray();
        int size = words.length;

        for (int i = 0; i < size; i += 2 * k) {
            int left = i;
            int right = Math.min (i + k - 1, size - 1);

            while (left < right){
                char letter = words [left];
                words[left++] = words [right];
                words[right--] = letter;
            }
        }
        return new String (words);
    }
}
