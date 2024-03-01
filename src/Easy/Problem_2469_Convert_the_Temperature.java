package Easy;

public class Problem_2469_Convert_the_Temperature {
    //Language Java
    //Runtime 0ms
    //Memory 42.4MB
    public double[] convertTemperature(double celsius) {
        double [] s = new double[2];
        s [0] = celsius + 273.15;
        s [1]= celsius * 1.80 + 32.00;
        return s;
    }
}
