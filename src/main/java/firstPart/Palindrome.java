package firstPart;

public class Palindrome {
    public void palindromeCheck(String a) {

        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        if (a.equalsIgnoreCase(b.toString())) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}