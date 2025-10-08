/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS
 * academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Vincent Li
 *****************************************************************************************************
 */

public class Main {
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