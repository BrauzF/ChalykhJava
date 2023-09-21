package lab2;

import java.util.Scanner;

/*
1. С помощью цикла вычислите значение выражения 2^n.
*/

public class za1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        double n = scanner.nextDouble();
        if (n < 0) {
            int i = 0;
            double rez = 2;
            for (i = -1; i > n; i--) {
                rez = Math.pow(2, i-1);
                System.out.println("2 ^ " + i + " = " + rez);
            }
        }
        else {
            int i = 0;
            double rez = 2;
            for (i = 1; i < n; i++) {
                rez = Math.pow(2, i+1);
                System.out.println("2 ^ " + (i + 1) + " = " + rez);
            }
        }
    }
}
