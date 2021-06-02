package firstPart;

import java.util.List;

public class NumberCheck {
    public void checkBy (int number, List<Integer> list){
        int result = 0;
        String numberStr = Integer.toString(number);
        for (Integer integer : list) {
            if (String.valueOf(integer).contains(numberStr)) {
                result += integer;
            }
        }
        if (result == 0){
            System.out.println("Searched numbers not found");
        }else{
            System.out.println("There are SUM of searched numbers: " + result);
        }
    }
}
