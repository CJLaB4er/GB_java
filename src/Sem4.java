import java.util.*;

public class Sem4 {

    public static void main(String[] args) {
//        task2();
        String[] arr = new String[] {"123", "222", "111", "444"};
        printStack(arr);
    }

    static void task1() {
        /*
        Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        Замерьте время, за которое в LinkedList добавятся 10000 элементов.
        Сравните с предыдущим.
        */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }

    static void task2() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            if (text.equals("print")) {
                System.out.println(list.remove(num));
            } else if (text.equals("exit")) {
                System.out.println("приложение завершено");
                break;
            } else {
                list.add(num, text);
            }
        }
    }

    static void task3() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользовател м "запоминает" строки.
        Если введено print, выводит строки так, что бы последняя была первой в списке, а первая - последней.
        если введено revert, удаляет предыдущуювведенную строку из памяти.
         */

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (true) {
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> itereator = list.listIterator(list.size());
                    while (itereator.hasPrevious()){
                        System.out.println(itereator.previous());
                    }
                    break;
                case "reevert":
                    list.removeLast();
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }

    }

    static void task4(){
        /*
        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */


    }
    static void printStack(String[] arr){
        LinkedList<String> linkedList = new LinkedList<>();
        for (String s : arr){
            linkedList.push(s);
        }
        System.out.println(linkedList);
    }
}
