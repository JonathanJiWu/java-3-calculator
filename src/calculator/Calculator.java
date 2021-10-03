package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number for calculation: ");
        int input1 = scan.nextInt();
        System.out.println("Please enter the second number for calculation: ");
        int input2 = scan.nextInt();
        System.out.println("");
        int inputOption = scan.nextInt();


        add(input1, input2);
        subtract(input1, input2);
        multiply(input1, input2);
        divide(input1, input2);
        exit();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println();
        scan.close();
    }

    public static void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1-num2);
    }
    public static void multiply(int num1, int num2) {
        System.out.println(num1*num2);
    }
    public static void divide(int num1, int num2) {
        System.out.println(num1/num2);
    }
    public static void exit() {

    }
}
