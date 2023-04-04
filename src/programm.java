// Побитовые операции 


// Ввод данных

// import java.util.Scanner;

// public class programm {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }  
// }


// Считывание примитивов:

// import java.util.Scanner;

// public class programm {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }  
// }


// Получение данных из примитивов:



// import java.util.Scanner;

// public class programm {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt(); // - проверяет является ли считываемое значение целым числом
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }  
// }

// Форматированный вывод
// Виды спецификаторов:
        // %d - целочисленное значение
        // %x - для вывода шестнадцатеричных чисел
        // %f - для вывода чисел с плавающей точкой
        // %e - для вывода чисел в экспоненциальной форме, например, 3,1415e+01
        // %c - для вывода одиночного символа
        // %s - для вывода строковых значений

        
public class programm {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a +b;
        String res = String.format("%d + %d = %d\n", a, b , c);
        System.out.println(res);
        


        // String s = "qwe";
        // int a = 123;
        // String q = s+a;
        // System.out.println(q);
    }  
}