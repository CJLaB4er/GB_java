import java.util.LinkedList;
import java.util.Random;

public class HWSem4 {
    public static void main(String[] args) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

        Реализуйте очередь с помощью LinkedList со следующими методами:
        • enqueue() — помещает элемент в конец очереди,
        • dequeue() — возвращает первый элемент из очереди и удаляет его,
        • first() — возвращает первый элемент из очереди, не удаляя.

        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        System.out.println(createLinkLst(10));
    }

    static LinkedList createLinkLst(int numb) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < numb; i++) {
            list.add(i, rnd.nextInt(1, 101));
        }
        return list;
    }
}
