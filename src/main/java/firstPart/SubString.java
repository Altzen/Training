package firstPart;

public class SubString {

    public static String getSubString (String inStr, int startPoint) {
        StringBuilder result = new StringBuilder();
        for (int j = startPoint; j < inStr.length(); j++) {
            result.append(inStr.charAt(j));
        }
        System.out.println("Edited FirstPart.SubString: " + result);
        return result.toString();
    }

}
