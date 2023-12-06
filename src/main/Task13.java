package main;

public class Task13 {

    public static void main(String[] args) {

        //2 eyniolculu massivin elementlerinin ust uste dusub dusmemesini yoxlamaq

        int[] arr1 = {2, 8, 5, 6, 3, 5};
        int[] arr2 = {2, 8, 5, 6, 3, 56};

        boolean isDifferent = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isDifferent = false;
                    break;
                }
            }
        } else {
            isDifferent = false;
        }

        if (isDifferent) {
            System.out.println("The same");
        } else {
            System.out.println("Different");
        }

    }
}
