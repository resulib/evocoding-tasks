package main;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        //massivde 7e qaliqsiz bolunen element sayini tapmaq

        int [] arr = {22,7,29,46,39,49,5,63,51,6,239,-248};

        int count = 0;
        for (int i : arr) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Result: " + count);
    }
}
