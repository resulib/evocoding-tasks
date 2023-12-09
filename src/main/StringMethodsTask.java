package main;


import java.util.Scanner;

public class StringMethodsTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuffer answer;

        System.out.print("Enter word: ");
        String originalWord = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(originalWord);


        boolean isWork = true;
        while (isWork) {
            System.out.println("Select an operation: " +
                    "\n0-Close application" +
                    "\n1-Reverse " +
                    "\n2-Append" +
                    "\n3-Insert" +
                    "\n4-Replace" +
                    "\n5-Delete Char Index" +
                    "\n6-Delete word");

            int operation = scanner.nextInt();
            switch (operation) {
                case 0: {
                    isWork = false;
                    break;
                }
                case 1: {
                    System.out.println("Given word: " + originalWord);
                    answer = stringBuffer.reverse();
                    System.out.println("Reversed word: " + answer);
                    break;
                }
                case 2: {
                    System.out.println("Add word: ");
                    String s1 = scanner.next();
                    System.out.println("Original word: " + stringBuffer);
                    System.out.println("Added word: " + s1);
                    answer = stringBuffer.append(" " + s1);
                    System.out.println("Result: " + answer);
                    break;
                }
                case 3: {
                    System.out.println("Insert index: ");
                    int index = scanner.nextInt();
                    System.out.println("Insert word: ");
                    String s1 = scanner.next();
                    answer = stringBuffer.insert(index, s1);
                    System.out.println("Original word: " + stringBuffer);
                    System.out.println("Index: " + index);
                    System.out.println("Added word: " + s1);
                    System.out.println("Result: " + answer);
                    break;
                }
                case 4: {
                    System.out.println("Start index: ");
                    int start = scanner.nextInt();
                    System.out.println("End index: ");
                    int end = scanner.nextInt();
                    System.out.println("Word: ");
                    String addedWord = scanner.next();
                    answer = stringBuffer.replace(start, end, addedWord);
                    System.out.println("Original word: " + stringBuffer);
                    System.out.println("Start index: " + start);
                    System.out.println("End index: " + end);
                    System.out.println("New word: " + addedWord);
                    System.out.println("Result: " + answer);
                    break;
                }
                case 5: {
                    System.out.println("Enter Index: ");
                    int index = scanner.nextInt();
                    answer = stringBuffer.deleteCharAt(index);
                    System.out.println("Original word: " + stringBuffer);
                    System.out.println("Index: " + index);
                    System.out.println("Result: " + answer);
                    break;
                }
                case 6: {
                    System.out.println("Original word: " + stringBuffer);
                    System.out.println("Word successfully deleted.");
                    break;
                }
                default: {
                    System.out.println("Invalid operation");
                    break;
                }
            }
            System.out.println("\n************************\n");
        }

    }
}
