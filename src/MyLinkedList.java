import java.util.*;

public class MyLinkedList {
    LinkedList list = new LinkedList<>();

    void pullLinkLstRnd(int numb) { // метод наполняет LinkedList строками случайных целых чисел (1-100), в кол-ве numb
        Random rnd = new Random();
        for (int i = 0; i < numb; i++) {
            list.add(Integer.toString(rnd.nextInt(1, 101)));
        }
    }

    void printLinkLst() { // метод для вывода в консоль элементов списка
        System.out.println(list);
    }

    LinkedList reverse() { // метод возвращает перевёрнутый список, оставляя исходник нетронутым
        LinkedList list2 = new LinkedList<>();
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }
        return list2;
    }

    void enqueue() { // метод помещает элемент в конец очеред
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        list.add(item);
    }

    String dequeue() { // метод возвращает первый элемент из очереди и удаляет его
        return (String) list.remove(0);
    }

    String first() { // метод возвращает первый элемент из очереди, не удаляя
        return (String) list.get(0);
    }

    int sum(){ // метод считает сумму всех элементов списка, в методе не реализована проверка на корректные данные с-ка
        ListIterator<String> iterator = list.listIterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += Integer.parseInt(iterator.next());
        }
        return sum;
    }
}
