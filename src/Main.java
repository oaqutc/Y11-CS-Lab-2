/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS
 * academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Vincent Li
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        // Test 1: add two integers
        int sumTwo = add(3, 8);
        System.out.println(sumTwo);

        // Test 2: add four integers
        int sumFour = add(3, 8, 4, 9);
        System.out.println(sumFour);

        // Test 3: morning greeting
        String morningGreetingResult = morningGreeting("Toby Fox");
        System.out.println(morningGreetingResult);

        // Test 4: afternoon greeting
        String afternoonGreetingResult = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingResult);

        // Test 5: triple
        String tripleResult = triple("oohbaby");
        System.out.println(tripleResult);

        // Test 6: half
        double halfResult = half(17);
        System.out.println(halfResult);

        // Test 7: round positive value
        int roundedPositive = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPositive);

        // Test 8: round negative value
        int roundedNegative = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegative);
    }

    // 1. add - takes two integers and returns their sum
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // 2. add - takes four integers and returns their sum using the two-parameter
    // add method
    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int firstSum = add(firstNumber, secondNumber);
        int secondSum = add(thirdNumber, fourthNumber);
        return add(firstSum, secondSum);
    }

    // 3. morningGreeting - returns a morning greeting in Chinese
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting - returns an afternoon greeting in Chinese
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple - returns the input string repeated three times
    public static String triple(String inputString) {
        return inputString + inputString + inputString;
    }

    // 6. half - takes an integer and returns half of its value as a double
    public static double half(int number) {
        return number / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger - rounds a positive double to the
    // nearest integer
    public static int roundPositiveValueToNearestInteger(double positiveValue) {
        return (int) (positiveValue + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger - rounds a negative double to the
    // nearest integer
    public static int roundNegativeValueToNearestInteger(double negativeValue) {
        return (int) (negativeValue - 0.5);
    }
}