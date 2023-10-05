package lab4;
//import java.util.Scanner;
import java.util.Random;
/*Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью.
Например, для цифры 9 на консоли должна быть напечатана строка «Девять».*/

public class za1 {
    public static void main(String args[]) {
        /*ввод с клавеатуры
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        int m = sc.nextInt(); */
        Random rn = new Random(); //рандомайзер
        int n = rn.nextInt(10 - 0 + 1) + 0;
        System.out.println("рандомное число " + n);

         switch (n) {    //кейс
            case (0) -> System.out.println("Нуль");
            case (1) -> System.out.println("Один");
            case (2) -> System.out.println("Два");
            case (3) -> System.out.println("Три");
            case (4) -> System.out.println("Четыре");
            case (5) -> System.out.println("Пять");
            case (6) -> System.out.println("Шесть");
            case (7) -> System.out.println("Семь");
            case (8) -> System.out.println("Восемь");
            case (9) -> System.out.println("Девять");
            default -> System.err.println("Ошибка запроса");
         }
    }


   public String toString(int n) { //способ через if
        if (n == 0) { System.out.println("Нуль"); }
        else if (n == 1) { System.out.println("Один"); }
        else if (n == 2) { System.out.println("Два"); }
        else if (n == 3) { System.out.println("Три"); }
        else if (n == 4) { System.out.println("Четыре");}
        else if (n == 5) { System.out.println("Пять"); }
        else if (n == 6) { System.out.println("Шесть"); }
        else if (n == 7) { System.out.println("Семь"); }
        else if (n == 8) { System.out.println("Восемь"); }
        else if (n == 9) { System.out.println("Девять"); }
        else    { System.err.println("Ошибка запроса"); }
       return null;
   }
}
