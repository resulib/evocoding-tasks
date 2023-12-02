package main;

public class Task4 {
    public static void main(String[] args) {

        //0-100 intervalında tək ve cüt ədədlərin cəminin hesablanmasi

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("0-100 araliginda CUT ededlerin cemi: " + evenSum);
        System.out.println("0-100 araliginda TEK ededlerin cemi: " + oddSum);
    }
}
