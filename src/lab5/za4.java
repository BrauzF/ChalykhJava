package lab5;
import java.util.Random;

/*4. Дан массив из целых чисел D(n), где n=1,30.
Посчитайте сумму четных и нечетных элементов массива.*/

public class za4 {
    public static void main(String args[]) {
        int[] D = new int[30];
        Random rn = new Random(); //рандомайзер
        for (int i = 0; i < D.length; i++) //заполнение массива
        {
            D[i] = rn.nextInt(30 - 1 + 1) + 1;
            System.out.print(" " + D[i]);
        }
        System.out.println();
        int sum1 = 0; //сумма четных элиментов
        int sum2 = 0; //сумма нечетных элиментов
        for (int i = 0; i < D.length; i++) //нахождение сумм
        {
            if (D[i]%2==0) {
                sum1 = sum1 + D[i];
            }
            else {
                sum2 = sum2 + D[i];
            }

        }
        System.out.println(" Сумма четных элементов: " + sum1 + " сумма нечетных элиментов " + sum2); //вывод сумм
    }
}
