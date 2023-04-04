//public class Sem2 {
//    public static void main(String[] args) {
////        System.out.println(task1());
////        System.out.println(task2());
////        System.out.println(task3());
//
//    }
//
//    static String task1() {
//        /*
//        Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//        Ответ: c1c2c1…c2 (всего N символов)
//         */
//        char c1 = 'a';
//        char c2 = 'b';
//        int n = 10;
//        if (n <= 0 || n % 2 != 0) {
//            return null;
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n / 2; i++) {
//            stringBuilder.append(c1);
//            stringBuilder.append(c2);
////            stringBuilder.append(c1).append(c2); данная строка заменяет собой предыдущие две
//        }
//        return stringBuilder.toString();
//    }
//
//    static String task2() {
//        /*
//            Напишите метод, который сжимает строку.
//            Пример: вход aaaabbbcdd.
//            Результат: a4b3c1d2
//         */
//        String s = "aaaabbbcdd";
//        int count = 1;
//        char[] arrChar = s.toCharArray(); // метод для разбиения строки на массив символов
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                count++;
//            } else {
//                stringBuilder.append(s.charAt(i - 1)).append(count);
//                count = 1;
//            }
//        }
//        stringBuilder.append(s.charAt(s.length() - 1)).append(count);
//        return stringBuilder.toString();
//    }
//
////    static Boolean task3() {
////        /*
////        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
////        Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
////         */
////        String str = "aa";
////
////        StringBuilder stringBuilder = new StringBuilder(str);
////        stringBuilder = stringBuilder.reverse();
////        if (str.equals(stringBuilder)){
////            return true;
////        }
////        return false;
////
////
//////        for (int i = 0, j = str.length()-1; i < str.length() / 2; i++, j--) {
//////            if (str.charAt(i) != str.charAt(j)){
//////                return false;
//////            }
//////        }
//////        return true;
////    }
//
//
