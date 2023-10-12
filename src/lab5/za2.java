package lab5;
import java.util.Random;
/*2. Дан массив из целых чисел B(n), где n=1,25.
Необходимо упорядочить массив по возрастанию.*/

public class za2 {
    public static void main(String args[]) {
        int[] B = new int[25];
        Random rn = new Random(); //рандомайзер
        for (int i = 0; i < B.length; i++) //заполнение массива
        {
            B[i] = rn.nextInt(25 - 1 + 1) + 1;
            System.out.print(" " + B[i]);
        }
        int temp;
        for (int i = 0; i < B.length; i++)  //Метод пузырька
        {
            for(int j = 0; j < B.length-1; j++)
            {
                if (B[j]>B[j+1])
                {
                  temp = B[j];
                  B[j] = B[j+1];
                  B[j+1] = temp;
                }
            }
        }
        System.out.println(" mass: ");
        for (int i = 0; i < B.length; i++) //вывод массива
        {
            System.out.print(" " + B[i]);
        }
    }
}
