package main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //reqem tapma oyunu

        Scanner scanner = new Scanner(System.in);
        int answer = 15;

        for (; ; ) {
            System.out.print("Dogru ededi texmin edin: ");
            int number = scanner.nextInt();

            if (number == answer) {
                System.out.println("Tebrikleri. Dogru ededi tapdiniz: " + answer);
                break;
            }

            for (; ; ) {
                if (number > answer) {
                    System.out.println("Daxil etdiyiniz reqem boyukdur");
                    break;
                } else {
                    System.out.println("Daxil etdiyiniz reqem kicikdir");
                    break;
                }
            }
            System.out.println("*******************");
        }
    }
}
