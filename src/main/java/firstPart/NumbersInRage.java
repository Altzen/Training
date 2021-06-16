package firstPart;

import java.util.ArrayList;
import java.util.List;

public class NumbersInRage {
    public List<Integer> getNumbersInRange(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        //System.out.println(result);
        return result;
    }
}
