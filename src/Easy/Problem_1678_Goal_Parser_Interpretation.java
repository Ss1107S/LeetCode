package Easy;

public class Problem_1678_Goal_Parser_Interpretation {
    //Language Java
    //Runtime 1ms
    //Memory 41.5MB
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}