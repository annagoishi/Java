import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        System.out.println("________1________");

        Scanner word = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = word.nextLine();
        System.out.println("Enter the second string: ");
        String b = word.nextLine();
        System.out.println(a.substring(0, a.length() / 2) + b.substring(b.length() / 2));

        System.out.println("________2________");

        addition(1,2);
        substraction(3,89);
        multiplication(78,56);
        division(67,55);
    }

    public static void addition(int num1, int num2) {
        int additionOfTwoNumbers = num1 + num2;
        System.out.println("The result of addition: " + additionOfTwoNumbers);
    }

    public static void substraction(int num1, int num2) {
        int substractionOfTwoNumbers = num1 - num2;
        System.out.println("The result of substraction: " + substractionOfTwoNumbers);
    }

    public static void multiplication(int num1, int num2) {
        int multiplicationOfTwoNumbers = num1 * num2;
        System.out.println("The result of multiplication: " + multiplicationOfTwoNumbers);
    }

    public static void division(int num1, int num2) {
        int divisionOfTwoNumbers = num1 / num2;
        System.out.println("The result of division: " + divisionOfTwoNumbers);
    }

}
