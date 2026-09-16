public class TemperatureConverter {
    public static double convertToCelcius(double temp) {
        temp = (temp - 32) * (5.0 / 9.0);
        return temp;
    }

    public static double convertToFahrenheit(double temp) {
        temp = (9.0 / 5.0) * temp + 32;
        return temp;
    }

    public static void main(String[] args) {
        int F = 32; // should give 0 degree
        int C = 100;  // should give 212

        System.out.println(convertToCelcius(F));
        System.out.println(convertToFahrenheit(C));
    }
}