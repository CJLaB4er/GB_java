import java.util.*;

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

        Notebook extensa = new Notebook("Extensa", "Acer", 15.6f, 4048, 128,
                "Windows", 18500, "домашний");

        Notebook rogStrixG15 = new Notebook("ROG Strix G15", "Asus", 15.6f, 16192, 512,
                "Без Ос", 175000, "игровой");

        Notebook ma13VF037RU = new Notebook("15M A13VF-037RU", "MSI", 15.6f, 16192, 1024,
                "Linux", 175000, "игровой");

        Notebook qx21 = new Notebook("qx21", "Digma", 17f, 2048, 256,
                "Linux", 25000, "домашний");

        Notebook aspire = new Notebook("Aspire", "Aser", 10f, 8096, 128,
                "Windows", 27000, "офисный");

        Notebook laptop = new Notebook("Laptop", "Asus", 12f, 4048, 1024,
                "Без ОС", 24500, "офисный");

        Notebook aquilon = new Notebook("Aquilon", "DEXP", 15.6f, 4048, 128,
                "Без ОС", 18500, "домашний");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(extensa);
        notebooks.add(rogStrixG15);
        notebooks.add(ma13VF037RU);
        notebooks.add(qx21);
        notebooks.add(aspire);
        notebooks.add(laptop);
        notebooks.add(aquilon);

        interce(notebooks);
    }

    static void interce(Set<Notebook> notebooks) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nВведите номер параметра, который требуется задать:\n" +
                    "1 - брэнд\n" +
                    "2 - размер экрана\n" +
                    "3 - объём оперативной памяти\n" +
                    "4 - объём жесткого диска\n" +
                    "5 - операционная система\n" +
                    "6 - максимальная цена\n" +
                    "7 - тип ноутбука\n" +
                    "8 - показать отфильтрованные модели\n" +
                    "9 - выход из программы\n");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Введите название бренда\n (Asus, Aser, Dexp, Digma, MSI)");
                    map.put("brand", scanner.nextLine());
                    break;
                case "2":
                    System.out.println("Укажите минимальную диагональ экрана\n");
                    map.put("size", scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Укажите минимальный объём оперативной памяти в MB");
                    map.put("ram", scanner.nextLine());
                    break;
                case "4":
                    System.out.println("Укажите минимальный объём жесткого диска в MB");
                    map.put("ram", scanner.nextLine());
                    break;
                case "5":
                    System.out.println("Укажите желаемую операционную систему\n" +
                            "(Windows, MacOS, Linux, без ОС)");
                    map.put("os", scanner.nextLine());
                    break;
                case "6":
                    System.out.println("Укажите максимальную цену");
                    map.put("price", scanner.nextLine());
                    break;
                case "7":
                    System.out.println("Укажите тип ноутбука\n" +
                            "(Домашний, игровой, офисный)");
                    map.put("type", scanner.nextLine());
                    break;
                case "8":
                    int count = 0;
                    for (Notebook notebook: notebooks) {
                        if(sortNote(notebook, map)){
                            System.out.println(notebook.getInfo());
                            count++;
                        }
                    }
                    if (count < 1){
                        System.out.println("Под ваши параметры не подходит ни одна модель, измените параметры " +
                                "фильтра");
                    }
                    break;
                case "9":
                    flag = false;
                    break;
                default:
                    System.out.println("неизвестная команда, повторите выбор.");
            }
            System.out.println("текущие параметры поиска: " + map);
        }
    }
    static boolean sortNote(Notebook notebook, HashMap<String, String> map){
        for (Map.Entry<String, String> param: map.entrySet()) {
                switch (param.getKey().toLowerCase()){
                    case "brand":
                        if (param.getValue().equals("") || param.getValue().equalsIgnoreCase(notebook.getBrand())){
                        break;
                        }
                        else{return  false;}
                    case "size":
                        if (Float.parseFloat(param.getValue()) < notebook.getSize()){
                            break;
                        }
                        else{return false;}
                    case "ram":
                        if (Integer.parseInt(param.getValue()) < notebook.getRam()){
                            break;
                        }
                        else {return false;}
                    case "rom":
                        if (Integer.parseInt(param.getValue()) < notebook.getRom()){
                            break;
                        }
                        else {return false;}
                    case "price":
                        if (Integer.parseInt(param.getValue()) >= notebook.getPrice()){
                            break;
                        }
                        else {return false;}
                    case "os":
                        if (param.getValue().equals("") || param.getValue().equalsIgnoreCase(notebook.getSystem())){
                            break;
                        }
                        else{return  false;}
                    case "type":
                        if (param.getValue().equals("") || param.getValue().equalsIgnoreCase(notebook.getType())){
                            break;
                        }
                        else{return  false;}
                }
            }
        return true;
    }
}







