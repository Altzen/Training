import java.util.ArrayList;
import java.util.List;

public class DivisionBy7 {
    public List<Integer> getDivisionBy7(List<Integer> number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            int decNumber = number.get(i) / 7;
            if (decNumber == 1 || decNumber == 2 || decNumber == 5) {
                result.add(number.get(i));
            }
        }
        if (result.size() == 0) {
            System.out.println("There are no matches");
        } else {
            System.out.println("Division By 7 Result: " + result);
        }
        return result;
    }
}

