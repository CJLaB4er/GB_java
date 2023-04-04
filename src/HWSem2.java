import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class HWSem2 {
    public static void main(String[] args) throws IOException {
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

        Logger logger = Logger.getLogger(HWSem2.class.getName());
        FileHandler fh = new FileHandler("src\\log.txt");
        logger.setUseParentHandlers(false); // отключаем вывод информации в консоль.
        logger.addHandler(fh);
        SimpleFormatter sForm = new SimpleFormatter();
        fh.setFormatter(sForm);
        logger.info("Программа запущена");
        reader(logger);
        logger.info("Работа программы завершена корректно\n");
    }

    static void reader(Logger logger) {
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
            logger.info("Считан файл и создана объект StringBuilder");
            String[] arrStr = stringBuilder.toString().split("\\},\\{"); // разбиваем строку на массив строк
            for (String item : arrStr){
                resultBuilder(item.replace("{","").replace("}", ""), logger);
            }

        }
        catch (IOException e) {
            System.out.println("File not found");
            logger.info("Файл для чтения не обнаружен");
        }
    }

    static void resultBuilder(String data, Logger logger){
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
        logger.info("Строка ответа сформирована и передана для записи в файл.");
        writeToFile(result.toString(), logger);
    }

    static void writeToFile(String str, Logger logger){
        try (FileWriter write = new FileWriter("src\\result.txt", true)){
            write.append(str).append("\n");
            logger.info("Стрка ответа записана в файл \"scr\\result.txt\"");
        }
        catch (Exception e){
            System.out.println("Операция записи в файл не выполнена");
            logger.info("Операция записи в файл не выполнена");
        }
    }
}
