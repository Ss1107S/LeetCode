package Easy;

public class Problem_434_Number_of_Segments_in_a_String {
    //Language Java
    //Runtime 1ms
    //Memory 40.4MB
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}