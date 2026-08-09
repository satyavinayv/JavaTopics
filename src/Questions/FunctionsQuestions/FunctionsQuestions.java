package Questions.FunctionsQuestions;

public class FunctionsQuestions {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
        System.out.println(primeNumber(201));
    }

    // Find 3 digit Armstrong number
    public static boolean armstrongNumber (int n)
    {
        int original = n;
        int sum = 0;
        int rem = 0;

        while(n > 0)
        {
            rem = n % 10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }

    // Prime number check
    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n%i == 0) {
                return true;
            }
        }

        return true;
    }
}
