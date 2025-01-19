package javabook.chapter04;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class exercise4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Digite o %dº número: ", counter);
            number = scanner.nextInt();


            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("O maior número: " + largest);
        scanner.close();
    }
}
