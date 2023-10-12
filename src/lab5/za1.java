package lab5;
import java.util.Random;
/*1. Дан массив из целых чисел A(n), где n=1,25.
Необходимо поменять местами его максимальный и минимальный элемент.*/

public class za1 {
    public static void main(String args[]) {
        int[] A = new int[25];
        Random rn = new Random(); //рандомайзер
        for (int i = 0; i < A.length; i++) //заполнение массива
        {
            A[i] = rn.nextInt(25 - 1 + 1) + 1;
            System.out.print(" " + A[i]);
        }
        int mini = 0;
        int maxi = 0;
        int min = A[0];
        int max = A[0];
        System.out.println();
        for (int i = 0; i < A.length; i++) //перебор массива для поиска минимального и максимального значений
        {
            if (min > A[i])
            {
                min = A[i];
                mini = i;
            }
            if (max < A[i])
            {
                max = A[i];
                maxi = i;
            }
        }
        System.out.println(" Min: " + min + " MinI: " + mini);
        System.out.println(" Max: " + max + " MaxI: " + maxi);
        System.out.println(" mass: ");
        for (int i = 0; i < A.length; i++) //перемещение элиметов и вывод массива
        {
            if (mini == i)
            {
                A[i]=max;
            }
            if (maxi == i)
            {
                A[i]=min;
            }
            System.out.print(" " + A[i]);
        }
    }
}
