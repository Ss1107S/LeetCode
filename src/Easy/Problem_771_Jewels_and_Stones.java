package Easy;

public class Problem_771_Jewels_and_Stones {
    //Language Java
    //Runtime 1ms
    //Memory 41.4MB
    public int numJewelsInStones(String jewels, String stones) {
        int s = 0;

        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    s++;
                }
            }
        }
        return s;
    }
}
