public class Palindrome {
    public void palindromeCheck(String a) {

        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}