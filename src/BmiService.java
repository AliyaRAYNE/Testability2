public class BmiService {
    public int calculate(double weight, double height) {
        double bmi = (double) weight / Math.pow((double) height, 2);
        return (int) bmi;
    }
}
