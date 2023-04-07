
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HWSem3 {
    public static void main(String[] args) {
        /*
        1) Пусть дан произвольный список целых чисел, удалить из него четные числа
        2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
        3) *Реализовать алгоритм сортировки слиянием
        4) *На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. Предложить хотя бы одно решение
         */
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i <10 ; i++) {
            list.add(rnd.nextInt(1, 101));
        }
        System.out.println("исходный список: ");
        System.out.println(list + "\n");

        System.out.println("Максимальное значение в списке: " +  Collections.max(list) + "\n");
        System.out.println("Минимальное значение в списке: " +  Collections.min(list) + "\n");
        int sum = 0;
        for (int item : list){
            sum += item;
        }
        System.out.println("Среднее арифметическое исходного списка: " +  (double)(sum) / list.size() + "\n");

        for (int i = 0; i <list.size() ; i++) {
            if((list.get(i) % 2) == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println("список без чётных чисел: ");
        System.out.println(list);

    }

}
