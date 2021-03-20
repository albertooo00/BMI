public class BmiService {
    public double calculate(double high, double mass) {
        double Bmi = mass / (high * high);
        return (int) Bmi;
    }
}