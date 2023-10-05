package lab3;

/*
Вычислить выражение 1-1/2+1/3-1/4...+1/999-1/1000,
используя оператор условия.

*/

public class za2 {
    public static void main(String args[]) {
        double n = 1;
        for (double i = 1; i<=1000; i++) {
            if (i%2 == 1) {     //проверка на нечетность
                n = n + 1/i;
            }
            else {
                n = n - 1/i;
            }
        }
        System.out.println("Результат: " + n);
    }
}
