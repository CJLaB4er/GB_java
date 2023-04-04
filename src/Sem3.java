import javax.swing.event.ListDataEvent;
import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        int a =5;
//        test(list, a);
//        System.out.println(a);
//        System.out.println(list);
//        task1();
//        task2();
//        task3();
        task4();
    }

    static void test(List<String> list, int a){
        list.add("test");
        a++;
    }

    static void task1(){
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */

        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
//        double a = Math.random() //вернет случайное число от 0 до 1 типа double
        for (int i = 0; i <10 ; i++) {
            list.add(rnd.nextInt(1,10));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
//        list.sort(Comparator.reverseOrder()); // уже готовый компоратор для реверса
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        System.out.println(list);

        // сортирока чисел по четным и нечётным числам
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%2==0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(list);

    }

    static void task2(){
        /*
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(1241);
        list.add(999);
        list.add("1241");
        list.add("world");
        list.add(7.123);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--; // при удалении индексы в массиве смещаются, поэтому компенсируем это уменьшением индекса
            }
        }
        System.out.println(list);
    }

    static void  task3(){
        /*
        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
        Напишите метод для заполнения данной структуры.
         */
        List<List<String>> shop = new ArrayList<>();
        addBook(shop, "Роман", "Война и мир");
        addBook(shop, "Фантастика", "Властелин колец");
        addBook(shop, "Фантастика", "Гарри Поттер");
        addBook(shop, "Рассказ", "Му-му");

        System.out.println(shop);
    }

    static void addBook(List<List<String>> shop, String genre, String bookName){
        for (List<String> item: shop){
            if (item.get(0).equals(genre)) {
                item.add(bookName);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(bookName);
        shop.add(list);
    }

    static void task4(){
        /*
        Заполнить список названиями аланет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */

//        List<String> planets = List.of("Меркурий", "Венера", "Земля", "Марс", "Юпиер", "Сатурн", "Уран",
//                "Нептун", "Плутон");
//        List<String> listPlanet = new ArrayList<>();
//        for (int i = 0; i < 30; i++) {
//            listPlanet.add(planets.get((int)(Math.random() * planets.size())));
//        }
//        System.out.println(listPlanet);
//        for (String planet: listPlanet){
//            int count = 0;
//            for (String item: listPlanet){
//                if (planet.equals(item));
//                count++;
//            }
//
//        }
//        System.out.println(planets + ":" + count);
//    }
        List<String> planets = List.of("Марс", "Венера", "Земля", "Юпитер", "Уран",
                "Нептун", "Плутон", "Меркурий", "Сатурн");
        List<String> listPlanets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listPlanets.add(planets.get((int)(Math.random() * planets.size())));
        }
        System.out.println(listPlanets);
        for (String planet: planets){
            int count = 0;
            for (String item: listPlanets){
                if (planet.equals(item)){
                    count++;
                }
            }
            System.out.println(planet + ": " + count);
        }
    }
}
