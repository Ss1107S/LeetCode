package Easy;

public class Problem_1507_Reformat_Date {
    //Language Java
    //Runtime 0ms
    //Memory 41.1MB
    public String reformatDate(String date) {
        StringBuilder reformatDate = new StringBuilder();
        reformatDate.append(date.substring(date.length() - 4)).append("-");
        String changeDate = date.length() == 13 ? date.substring(5, 8) : date.substring(4, 7);

        switch(changeDate){
            case "Jan": reformatDate.append("01-"); break;
            case "Feb": reformatDate.append("02-"); break;
            case "Mar": reformatDate.append("03-"); break;
            case "Apr": reformatDate.append("04-"); break;
            case "May": reformatDate.append("05-"); break;
            case "Jun": reformatDate.append("06-"); break;
            case "Jul": reformatDate.append("07-"); break;
            case "Aug": reformatDate.append("08-"); break;
            case "Sep": reformatDate.append("09-"); break;
            case "Oct": reformatDate.append("10-"); break;
            case "Nov": reformatDate.append("11-"); break;
            case "Dec": reformatDate.append("12-"); break;
        }

        if(date.length() < 13){
            reformatDate.append("0");
            reformatDate.append(date.substring(0,1));
        }else{
            reformatDate.append(date.substring(0,2));
        }

        return reformatDate.toString();
    }
}