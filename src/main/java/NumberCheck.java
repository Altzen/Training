import java.util.List;

public class NumberCheck {
    public void checkBy(int number, List<Integer> list) {
        int result = 0;
        String numberStr = Integer.toString(number);
        for (int i = 0; i < list.size(); i++) {
            if (String.valueOf(list.get(i)).contains(numberStr)) {
                result += list.get(i);
            }
        }
        if (result == 0) {
            System.out.println("Searched numbers not found");
        } else {
            System.out.println("There are SUM of searched numbers: " + result);
        }
    }
}
