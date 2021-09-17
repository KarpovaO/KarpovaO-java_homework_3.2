public class Main {
    public static void main(String[] args) {
        MassIndexService service = new MassIndexService();
        double weight = 60.5;
        double height = 1.6;
        double MassIndex = service.calculate(weight,height);
        System.out.println("Индекс массы тела = " + MassIndex + " кг/м2");
    }
}