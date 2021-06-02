package firstPart;

public class Fibonacci {
    static int getFib(int n)
    {
        if (n <= 1)
            return n;
        return getFib(n-1) + getFib(n-2);

    }
}
