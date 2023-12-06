package main;

public class Task10 {
    public static void main(String[] args) {

        int [] arr = {4,2,6,4,4,2,12,12};
        int count = 0;

        int[] arr2 = new int[count];

        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count ++;
                    System.out.println(arr[i]);
//                    arr2[a] = arr[i];
//                    a++;
                }
            }



        }

    }
}
