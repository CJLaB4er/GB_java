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

        MyLinkedList list = new MyLinkedList();

        list.pullLinkLstRnd(10);

        System.out.println("Сгенерированный список:");
        list.printLinkLst();

        System.out.println("Перевёрнутый список:");
        System.out.println(list.reverse());

        System.out.println("Изначальный список остался прежним:");
        list.printLinkLst();

        System.out.println("Добавляем элемент в конец очереди:");
        list.enqueue();

        System.out.println("Возвращаем первый элемент из очереди и удаляет его:");
        System.out.println(list.dequeue());

        System.out.println("Теперь список выглядит так:");
        list.printLinkLst();

        System.out.println("Возвращаем первый элемент списка не удаляя его:");
        System.out.println(list.first());

        System.out.println("Изначальный список остался прежним:");
        list.printLinkLst();

        System.out.println("Сумма всех элементов списка равна = " + list.sum());

    }

}

