import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
Во всех задачах отсутствует проверка на корректный ввод.
 */

public class HWSem1 {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        return numb;
    }

    static boolean isSimple(int numb){
        if (numb % 2 == 0 || numb % 3 == 0 || numb % 5 == 0){
            return false;
        }
        for (int i = 3; i <=sqrt(numb) ; i++) {
            if (numb % i == 0){
                return false;
            }
        }
        return true;
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

    static void task3(){
        /*
        Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[2, ");
        for (int i = 3; i <1000 ; i++) {
            if (isSimple(i)){
                stringBuilder.append(i + ", ");
            }
            }
        stringBuilder.deleteCharAt(stringBuilder.length()-1); // избавляеся от последнего символа пробела
        stringBuilder.setCharAt(stringBuilder.length()-1, ']'); // заменяем последнюю ',' на ']'
        System.out.println(stringBuilder.toString());
    }
}
