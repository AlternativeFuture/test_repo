package test_repo;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int inputNum = scanner.nextInt();

        int num = (inputNum + 45) /45 ;
        switch (num) {
            case 1:
                System.out.println("Input number is in range 0-44.");
                break;
            case 2:
                System.out.println("Input number is in range 45-89.");
                break;
            case 3:
                System.out.println("Input number is in range 90-134.");
                break;
            default:
                System.out.println("Out of range.");
        }
    }
}
