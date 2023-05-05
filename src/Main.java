
public class Main {
    public static void main(String[] args) {
        BmiService max = new BmiService();
        int index = max.calculate(1.90, 103 );
        System.out.println("Индекс BMI:" + index);
        }
    }
