public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massIndex = service.calculate(80, 300);
        System.out.println(massIndex);

    }
}
