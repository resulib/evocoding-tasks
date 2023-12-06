package main;

public class Task11 {
    public static void main(String[] args) {

        //elementler artaraq duzulub duzulmemesini yoxlamaq (1,2,3) positive case, (1,3,2) negative case

        int[] arr = {1, 3, 2};

        boolean isPositiveCase = true;

        int lastIndex = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lastIndex) {
                isPositiveCase = false;
            }
        }
        if (isPositiveCase) {
            System.out.println("Positive case");
        } else {
            System.out.println("Negative case");
        }

    }
}
