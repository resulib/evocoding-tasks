package main;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {


        //tek indexde durmus elementleri 0-la evez etmek

        int [] arr = {22,15,29,46,39,91,5,103,51,6,239,-248};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
