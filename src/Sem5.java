import java.util.*;

public class Sem5 {
    public static void main(String[] args) {
//        task1();
//        System.out.println(task2("foo", "bar"));
//        System.out.println(task3("<{a}+{(d*3)}>"));
        task4("Мороз и солнце день чудесный\n Еще ты дремлешь друг прелестный\n Пора красавица проснись.");
        }


    static void task1(){
        /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Pasports pasports = new Pasports();
        pasports.add("123456", "Иванов");
        pasports.add("321456", "Васильев");
        pasports.add("234561", "Петрова");
        pasports.add("234432", "Иванов");
        pasports.add("654321", "Петрова");
        pasports.add("345678", "Иванов");

        pasports.getByName("Иванов");
    }

    static boolean task2(String s1, String s2){
        /*
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        буква может не меняться, а остаться такой же. (Например, note - code)
        Пример 1:
        Input: s = "foo", t = "bar"
        Output: false
        Пример 2:
        Input: s = "paper", t = "title"
        Output: true
         */
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length ; i++) {
            if (map.containsKey(c1[i])){ // есть ли такой ключ в коллекции
                if (c2[i] != map.get(c1[i])){ // метод get получает значение по ключу
                    return false;
                }
            }else {
                map.put(c1[i], c2[i]);
            }

        }
        return true;
    }

    static boolean task3(String str){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
         */
        Stack<Character> stack = new Stack<>();
        char[] c1 = str.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (int i = 0; i <str.length() ; i++) {
            if (map.containsKey(c1[i])){
                stack.push(c1[i]);
            }
            if(map.containsValue(c1[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c1[i]) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void task4(String str){
        /*
        Взять набор слов, например:

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.

        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны “потеряться”.
         */

        str = str.replace("\n", "");
        str = str.replace(".", "");
        Map<Integer, List<String>> map = new TreeMap<>();
        String[] arr = str.split(" ");
        for (String word : arr){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            }else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
