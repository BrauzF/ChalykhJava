package lab5;
import java.util.Random;

/*3. Дан массив из целых чисел С(n), где n=1,20.
Необходимо найти среднее значение и вывести его на консоль.*/

public class za3 {
    public static void main(String args[]) {
        int[] C = new int[20];
        Random rn = new Random(); //рандомайзер
        for (int i = 0; i < C.length; i++) //заполнение массива
        {
            C[i] = rn.nextInt(20 - 1 + 1) + 1;
            System.out.print(" " + C[i]);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < C.length; i++) //нахождение суммы
        {
            sum = sum + C[i];

        }
        System.out.println(" Сумма: " + sum + " среднее значение " + sum/C.length); //среднее значение
    }
}
