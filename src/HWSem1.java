import java.util.Scanner;

public class HWSem1 {
    public static void main(String[] args) {
        task1();
    }

    static void task1(){
        /*
        Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        Tn = 1/2 * n * (n + 1)
         */
        System.out.println("Введите номер треугольного числа: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int t = (numb * (numb + 1)) / 2; // используется тип int так как треугольное число всегда является целым числом.
        System.out.println("Треугольное число №" + numb + " = " + t);

    }
}
