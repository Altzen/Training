public class SumOfEvenDigits {
    public int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int finalNumber = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                finalNumber += number % 10;

            }
            number = number / 10;

        }
        System.out.println("Digit SUM = " + finalNumber);
        return finalNumber;

    }
}
