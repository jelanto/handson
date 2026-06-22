public class FinancialForecast {

    static double predictValue(double value, double rate, int years) {
        if (years == 0)
            return value;

        return predictValue(value * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double result = predictValue(10000, 0.10, 3);

        System.out.println("Future Value: " + result);
    }
}