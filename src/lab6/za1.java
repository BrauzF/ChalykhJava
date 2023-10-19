package lab6;
import java.util.Scanner;
/*Напишите программу, которая моделирует работу банкомата по выдаче введенной суммы денег
наименьшим количеством рублевых купюр.*/

public class za1 {
    public static void main(String args[]) {
        int n5000, n2000, n1000, n500, n200, n100, n50, n10; //счетчик купюр
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int rub = scanner.nextInt(); //ввод суммы

        System.out.println("Выданные купюры: ");
        if (rub >= 5000) {  //счетчик 5000 купюр
            n5000 = rub/5000;
            rub %= 5000;
            System.out.println("5000 Р " + n5000);
        }
        if (rub >=2000) {   //счетчик 2000 купюр
            n2000 = rub/2000;
            rub %= 2000;
            System.out.println("2000 Р " + n2000);
        }
        if (rub >=1000) {    //счетчик 1000 купюр
            n1000 = rub/1000;
            rub %= 1000;
            System.out.println("1000 Р " + n1000);
        }
        if (rub >=500) {    //счетчик 500 купюр
            n500 = rub/500;
            rub %= 500;
            System.out.println("500 Р " + n500);
        }
        if (rub >=200) {     //счетчик 200 купюр
            n200 = rub/200;
            rub %= 200;
            System.out.println("200 Р " + n200);
        }
        if (rub >=100) {    //счетчик 100 купюр
            n100 = rub/100;
            rub %= 100;
            System.out.println("100 Р " + n100);
        }
        if (rub >=50) {    //счетчик 50 купюр
            n50 = rub/50;
            rub %= 50;
            System.out.println("50 Р " + n50);
        }
        if (rub >=10) {    //счетчик 10 купюр
            n10 = rub/10;
            System.out.println("10 Р " + n10);
        }
    }
}
