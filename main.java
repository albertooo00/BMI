public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass;
        double high;
        double Bmi = service.calculate(1.7, 77.7);
        System.out.println(Bmi);
    }
}
