import java.util.Scanner;
import static java.lang.Math.sqrt;

/*
Для того, что бы не перегружать код, во всех задачах отсутствует проверка на корректный ввод.
 */

public class HWSem1 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
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

    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
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

    static double calculate(String chr, double fNumb, double sNumb){
        double result = 0;
        if (chr.equals("+")){
            result = fNumb + sNumb;
        }
        else if (chr.equals("-")) {
            result = fNumb - sNumb;
        }
        else if (chr.equals("*")) {
            result = fNumb * sNumb;
        }
        else if (chr.equals("/")) {
            result = fNumb / sNumb;
        }
        else if (chr.equals("^")) {
            result = Math.pow(fNumb, sNumb);
        }
//        else if (chr.equals("sqrt2")) {
//            result = Math.sqrt(fNumb);
//        }
//        else if (chr.equals("sqrt3")) {
//            result = Math.cbrt(fNumb);
//        }
        return result;
    }

    static boolean checkEqul(String str){
        String[] strArr = str.split("\\s*(\\+|\\=)\\s*");
        int q = Integer.parseInt(strArr[0]);
        int w = Integer.parseInt(strArr[1]);
        int e = Integer.parseInt(strArr[2]);
        if (q + w == e) {
            return true;
        }
        return false;
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
        System.out.println("Данный калькулятор поддерживает только простые операции: [+, -, *, /, ^]\nТак же в нём отсутствует проверка на корректность ввода");
        System.out.println("Введите первое число: ");
        double fNumb = inputDouble();
        System.out.println("Введите второе число: ");
        double sNumb = inputDouble();
        System.out.println("Введите знак требуемой операции: [+, -, *, /, ^] ");
        Scanner scanner = new Scanner(System.in);
        String chr = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(fNumb + chr + sNumb+ " = ").append(calculate(chr, fNumb, sNumb));
        System.out.println(stringBuilder);
        }

    static void task5(){
        /*
         * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например,
         * 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
         * Предложить хотя бы одно решение или сообщить, что его нет.
         */
        System.out.println("Задано уравнение вида q + w = e, q, w, e >= 0\nНекоторые цифры могут быть заменены" +
                "знаком вопроса, например, 2? + ?5 = 69\nВведите своё уравнение в одну строку.");
        int count = 0;
        String str = inputStr();
        StringBuilder stringBuilder = new StringBuilder();
        for (int q = 0; q < 10; q++){
            for (int w = 0; w < 10; w++){
                for (int e = 0; e < 10; e++ ){
                    String tempStr = str.replaceFirst("\\?", Integer.toString(q));
                    tempStr = tempStr.replaceFirst("\\?", Integer.toString(w));
                    tempStr = tempStr.replaceFirst("\\?", Integer.toString(e));
                    if (checkEqul(tempStr) && !stringBuilder.toString().contains(tempStr)){
                        stringBuilder.append(tempStr);
                        count++;
                        System.out.println(count + ") " + tempStr);
                    }
                }
            }
        }
        if (stringBuilder.toString().length() < 1){
            System.out.println("Нет ни одного решения данного уравнения.");
        }
    }
}
