package main;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        //massivin en kicik cut ve en boyuk tek ededinin tapilmasi

        int [] arr = {22,15,29,46,39,91,5,103,51,6,239,-248};

        int small = arr[0];
        int big = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small && arr[i] % 2 == 0 ) {
                small = arr[i];
            }
            if (arr[i] > big && arr[i] % 2 != 0 ) {
                big = arr[i];
            }
        }

        System.out.println("small: " + small + "\nbig: " + big);


    }
}
