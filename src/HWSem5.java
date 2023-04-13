import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HWSem5 {
    public static void main(String[] args) {
        /*
        1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        что 1 человек может иметь несколько телефонов.

        2) Пусть дан список сотрудников:

        Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
        Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
        Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

        3) *Реализовать алгоритм пирамидальной сортировки (HeapSort)

        4) **На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
        (если еще не решали, но очень хочется)
         */


//        phoneBook();
        staff();

    }

    static void phoneBook() {
        Scanner scanner = new Scanner(System.in);
        MyPhoneBook book = new MyPhoneBook();
        while (true) {
            System.out.println("Для добавления записи, введите Имя и номер телефона через пробел, " +
                    "для завершения программы введите \"Выход\"");
            String s = scanner.nextLine();
            if (s.toLowerCase().equals("выход")) {
                System.out.println("Работа программы завершена!");
                break;
            }
            book.add(s.split(" "));
            book.print();
        }
    }

    static void staff() {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        String[] arr = s.split(", ");

        MyTreeMap treeMap = new MyTreeMap();

        for (String item : arr) {
            treeMap.add(item);
        }
        System.out.println("\nСгруппировали по имени:");
        treeMap.print();

        MyTreeMap sortTreeMap = new MyTreeMap();

        for (Map.Entry<String, List<String>> entry : treeMap.map.entrySet()) {
            String str = Integer.toString(entry.getValue().size());
            str = str + " " + entry.getKey();
            sortTreeMap.add(str);
        }
        System.out.println("\nВывели как: ключ - сколько раз имя встречается, значение - список имён с этим количеством." +
                "\nСортировка по убыванию.");
        sortTreeMap.print();
    }
}
