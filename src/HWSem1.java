import java.util.Scanner;

/*
Во всех задачах отсутствует проверка на корректный ввод.
 */

public class HWSem1 {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        return numb;
    }

    static void task1() {
        /*
        Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        Tn = 1/2 * n * (n + 1)
         */
        System.out.println("Введите номер треугольного числа: ");
        int numb = inputInt();
        int t = (numb * (numb + 1)) / 2;
        System.out.println("Треугольное число №" + numb + " = " + t);
    }

    static  void task2(){
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println("Введите положительное целое число для рассчёта его факториала: ");
        int numb = inputInt();
        int res = 1;
        while (numb > 1){
            res *= numb;
            numb -= 1;
        }
        System.out.println("Факториал чиала " + numb + " = " + res);
    }
}
