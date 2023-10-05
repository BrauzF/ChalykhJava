package lab3;
import java.util.Scanner;

public class za1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100: ");
        int n = sc.nextInt();

        if (n > 1 && n < 100) {  //проверка на соответствие диапозону

            for (int i = 1; i <= 100; i++) {
                for (int j = 1; j <= 100; j++) {
                    for (int k = 1; k <= 100; k++) {
                        double a = Math.pow(i, n);
                        double b = Math.pow(j, n);
                        double c = Math.pow(k, n);
                        if (a + b == c) {
                            System.out.println(i + " ^ " + n + " + " + j + " ^ " + n + " = " + k + " ^ " + n);
                        }
                    }
                }
            }
        }
        else {
            System.err.println("Решения нет");
        }
    }
}
