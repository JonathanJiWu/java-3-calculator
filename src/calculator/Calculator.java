package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number for calculation: ");
        double input1 = scan.nextInt();
        System.out.println("Please enter the second number for calculation: ");
        double input2 = scan.nextInt();
        System.out.println("What calculation would you like to do with these two numbers? Please type in \"add/subtract/multiply/divide\" or type in \"exit\" to exit the program.");
//        don't know why nextLine() doesn't work here
        String inputOption = scan.next();
        switch (inputOption.toLowerCase()){
            case "add":
                add(input1, input2);
                break;
            case "multiply":
                multiply(input1, input2);
                break;
            case "divide":
                divide(input1, input2);
                break;
            case "subtract":
                subtract(input1, input2);
                break;
            case "exit":
                exit();
                break;
            default:
                System.out.println("Invalid Entry, Try Again");
                break;
        }
        scan.close();
    }
    public static void add(double num1, double num2) {
        System.out.println(num1+num2);
    }
    public static void subtract(double num1, double num2) {
        System.out.println(num1-num2);
    }
    public static void multiply(double num1, double num2) {
        System.out.println(num1*num2);
    }
    public static void divide(double num1, double num2) {
        System.out.println(num1/num2);
    }
    public static void exit() {
        System.exit(0);
    }
}
