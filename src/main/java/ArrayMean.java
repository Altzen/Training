import java.util.List;


public class ArrayMean {

    public double mean(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        return (double) sum / list.size();
    }

    public double max(List<Integer> list) {
        double maxValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxValue) {
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }

    public double min(List<Integer> list) {
        double minValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }

    public void getMinMaxValueAndMean(List<Integer> list) {
        System.out.println("MIN Value: " + min(list));
        System.out.println("MAX Value: " + max(list));
        System.out.println("MEAN Value: " + mean(list));
    }
}
