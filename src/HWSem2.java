
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HWSem2 {
    public static void main(String[] args) {
        /*
        Дана json строка
        { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"} }

        Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
        Используйте StringBuilder для подготовки ответа

        Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл

        * Получить исходную json строку из файла, используя FileReader или Scanner

        * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        * - по желанию
         */

        reader();
    }

    static void reader() {
        FileReader fileReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileReader = new FileReader("src/HWSem2.json");
            int chr;
            while ((chr = fileReader.read()) != -1) {
                if (!"[]\s\r\n".contains(Character.toString(chr))) { // не считываем ненужные символы
                    stringBuilder.append((char) chr); // строим строку из нужных нам символов
                }
            }
            String[] arrStr = stringBuilder.toString().split("\\},\\{"); // разбиваем строку на массив строк
            for (String item : arrStr){
                resultBuilder(item.replace("{","").replace("}", ""));
            }

        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }

    static void resultBuilder(String data){
        String[] firstStr = data.split(",");
        StringBuilder result = new StringBuilder();
        for (String item : firstStr){
            String[] tempStr = item.split(":");
            if (tempStr[0].equals("\"фамилия\"")){
                result.append("Студент ").append(tempStr[1].replace("\"", ""));
            } else if (tempStr[0].equals("\"оценка\"")) {
                result.append(" получил ").append(tempStr[1].replace("\"", ""));
            } else if (tempStr[0].equals("\"предмет\"")) {
                result.append(" по предмету ").append(tempStr[1].replace("\"", "")).append(".");
            }
        }
        writeToFile(result.toString());
    }

    static void writeToFile(String str){
        try (FileWriter write = new FileWriter("src\\result.txt", true)){
            write.append(str).append("\n");
            System.out.println("строка \"" + str + "\" добавлена в src\\result.txt");
        }
        catch (Exception e){
            System.out.println("Операция записи в файл не выполнена");
        }
    }
}
