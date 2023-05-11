public class BmiService {
    public int calculate(int weight, int height) {
        int massIndex = weight / (height * height);
        if (massIndex < 18.5) {
            System.out.println("Недовес: меньше чем 18.5");
        }
        if ((massIndex >= 18.5) && (massIndex <= 24.9)) {
            System.out.println("Нормальный: между 18.5 и 24.9");
        }
        if ((massIndex >= 25) && (massIndex <= 29.9)) {
            System.out.println("Избыточный вес: между 25 и 29.9");
        }
        if (massIndex >= 30) {
            System.out.println("Ожирение: 30 или больше");
        }
        return massIndex;
    }
}