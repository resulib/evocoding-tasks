package main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Vurma cedveli

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (i * number));
        }
    }
}
