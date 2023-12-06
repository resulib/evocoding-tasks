package main;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        //massivde olan sade ededlerin sayini tapmaq

        int[] arr = {5, 7, 11, 12, 15, 19, 21, 89};

        int count = -1;

        for(int i=0; i<arr.length; i++) {
            boolean isPrime = true;

            for (int j=2; j<i; j++){

                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}
