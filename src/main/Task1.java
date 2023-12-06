package main;

public class Task1 {
    public static void main(String[] args) {

        //0-100 intervalında sadə ədələrin tapılması

        int count;
        for (int i = 2; i <= 100; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) count++;
            }

            if (count == 0) {
                System.out.println(i);
            }

        }
    }
}
