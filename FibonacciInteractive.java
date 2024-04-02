package assignment1_2_andmore;

import java.util.Scanner;

public class FibonacciInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.print("Do you want the Fibonacci series in numbers or words? (Numbers/Words): ");
        String choice = scanner.next().toUpperCase();

        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) {
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }

        if (choice.equals("NUMBERS")) {
            System.out.println("Fibonacci Series in Numbers:");
            for (int num : series) {
                System.out.print(num + " ");
            }
        } else if (choice.equals("WORDS")) {
            NumberWords numberWords = new NumberWords();
            System.out.println("Fibonacci Series in Words:");
            for (int num : series) {
                System.out.print(numberWords.convertToWords(num) + " ");
            }
        } else {
            System.out.println("Invalid choice. Please type 'Numbers' for numbers or 'Words' for words.");
        }
    }
}
