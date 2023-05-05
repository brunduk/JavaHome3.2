public class BmiService {
    public int calculate (double height_meter, int weight_kg) {
        double result = weight_kg / (height_meter * 2);
        return (int) result;
    }
}
