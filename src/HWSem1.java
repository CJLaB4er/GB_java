import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/*
Во всех задачах отсутствует проверка на корректный ввод.
 */

public class HWSem1 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        return numb;
    }

    static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        double numb = scanner.nextDouble();
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
        int numb1 = numb;
        int res = 1;
        while (numb > 1){
            res *= numb;
            numb -= 1;
        }
        System.out.println("Факториал чиала " + numb1 + " = " + res);
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

    static void task4(){
        /*
        Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
         */
        String res = "";
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Введите первое число: ");
        double fNumb = inputDouble();
        System.out.println("Введите второе число: ");
        double sNumb = inputDouble();
        System.out.println("Введите знак требуемой операции: ");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        if (ch.equals("+")){
            stringBuilder.append("Результат сложения чисел ").append(fNumb).append(" и ").append(sNumb).append(" равен ").append(fNumb + sNumb);
            System.out.println(stringBuilder);
        } else if (ch.equals("-")) {
            stringBuilder.append("Результат вычитания чисел ").append(fNumb).append(" и ").append(sNumb).append(" равен ").append(fNumb - sNumb);
            System.out.println(stringBuilder);
        } else if (ch.equals("*")) {
            stringBuilder.append("Результат умножения чисел ").append(fNumb).append(" и ").append(sNumb).append(" равен ").append(fNumb * sNumb);
            System.out.println(stringBuilder);
        } else if (ch.equals("/")) {
            stringBuilder.append("Результат деления чисел ").append(fNumb).append(" и ").append(sNumb).append(" равен ").append(fNumb / sNumb);
            System.out.println(stringBuilder);
        } else if (ch.equals("^")) {
            stringBuilder.append("Результат возведения ").append(fNumb).append(" в степень ").append(sNumb).append(" равен ").append(Math.pow(fNumb, sNumb));
            System.out.println(stringBuilder);
        } else if (ch.equals("sqrt")) {
            res = decimalFormat.format(Math.pow(fNumb, 1/ sNumb));
            stringBuilder.append("Результат корня ").append(sNumb).append(" степени числа  ").append(fNumb).append(" равен ").append(res);
            System.out.println(stringBuilder);
        }
    }
}
