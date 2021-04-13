import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check on Palindrome: ");
        String word = scanner.nextLine();

        System.out.print("Please enter your message: ");
        String message = scanner.nextLine();
        System.out.print("Please enter start point: ");
        int startPoint = scanner.nextInt();

        System.out.print("Please enter number for Sum of Even Digits:");
        int number = scanner.nextInt();

        System.out.print("Please enter Start of range:");
        int rStart = scanner.nextInt();
        System.out.print("Please enter End of range:");
        int rEnd = scanner.nextInt();

        System.out.print("Please enter number to check: ");
        int numCheck = scanner.nextInt();

        System.out.print("Please enter Liters:");
        double liter = scanner.nextDouble();

        System.out.print("Please enter Gallons:");
        double gallon = scanner.nextDouble();

        System.out.print("Please enter number for Fibonacci: ");
        int fib = scanner.nextInt();

        System.out.print("Please enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter y coordinate: ");
        double y = scanner.nextDouble();
        System.out.print("Please enter z coordinate: ");
        double z = scanner.nextDouble();




        List<Integer> numberInRage;

        SumOfEvenDigits sumOfEvenDigits = new SumOfEvenDigits();
        sumOfEvenDigits.getEvenDigitSum(number);

        SubString subString = new SubString();
        subString.getSubString(message,startPoint);

        NumbersInRage numbersInRage = new NumbersInRage();
        numberInRage = numbersInRage.getNumbersInRange(rStart,rEnd);

        DivisionBy7 divisionBy7 = new DivisionBy7();
        divisionBy7.getDivisionBy7(numberInRage);

        LitersAndGallons litersIntoGallons = new LitersAndGallons();
        litersIntoGallons.getLitersIntoGallons(gallon);
        litersIntoGallons.getGallonsIntoLiters(liter);

        Palindrome palindrome = new Palindrome();
        palindrome.palindromeCheck(word);

        NumberCheck numberCheck = new NumberCheck();
        numberCheck.checkBy(numCheck,numberInRage);

        Fibonacci fibonacci = new Fibonacci();
        System.out.println("There is Fibonacci result: " + fibonacci.getFib(fib));

        ArrayMean arrayMean = new ArrayMean();
        arrayMean.getMinMaxValueAndMean(numberInRage);

        Quadrant quadrant = new Quadrant();
        quadrant.getQuadrant(x,y,z);




    }
}
