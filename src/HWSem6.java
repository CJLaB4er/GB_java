import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class HWSem6 {
    public static void main(String[] args) {
        /*
        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
        отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
        соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
        фильтрации можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
         */

        Notebook notebook = new Notebook("Extensa", "Acer", "15.6", "4048", "128",
                "Windows", "18500", "домашний");

        writeToFile(notebook.getInfo());

        createHashSetNotebooks();

        Set<Notebook> notebookSet = new HashSet<>();


    }

    static void writeToFile(String str) {
        try (FileWriter write = new FileWriter("src\\notebooksDB.txt", true)) {
            write.append(str).append("\n");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так! Необходимо вроверить код.");
        }
    }

    static void createHashSetNotebooks() {
        File file = new File("src/notebooksDB.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){

            }
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так! Необходимо вроверить код.");
        }

    }
}



