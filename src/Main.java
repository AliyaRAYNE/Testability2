public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        double height = 1.70;
        int result = service.calculate(weight, height);

        System.out.println();
        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + height);
        System.out.println("Индекс массы тела: " + result);

    }
}