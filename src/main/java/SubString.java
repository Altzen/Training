
public class SubString {

    public static String getSubString(String inStr, int startPoint) {
        String result = "";
        for (int j = startPoint; j < inStr.length(); j++) {
            result = result + inStr.charAt(j);
        }
        System.out.println("Edited SubString: " + result);
        return result;
    }

}
