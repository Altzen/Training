package firstPart;

import java.util.ArrayList;
import java.util.List;

public class DivisionBy7 {
    public List<Integer> getDivisionBy7(List<Integer> number) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : number) {
            if (integer / 7 == 1) {
                result.add(integer);
            } else if (integer / 7 == 2) {
                result.add(integer);
            } else if (integer / 7 == 5) {
                result.add(integer);
            }
        }
        if (result.size() == 0){
            System.out.println("There are no matches");
        }
        else{
        System.out.println("Division By 7 Result: " + result);}
        return result;
    }
}

