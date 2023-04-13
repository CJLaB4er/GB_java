import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyPhoneBook {
    Map<String, List<String>> tmpbook = new HashMap<>();

    void add(String[] list) {
        String name = list[0];
        String phone = list[1];
        if (tmpbook.containsKey(name)) {
            if (phoneInBook(name, phone)) {
                List<String> tmplst = tmpbook.get(name);
                tmplst.add(phone);
            }
            else {
                System.out.println("Данный номер уже присутствует в книге.");
            }
        } else {
            List<String> tmpslt = new ArrayList<>();
            tmpslt.add(phone);
            tmpbook.put(name, tmpslt);
        }
    }

    void print() {
        System.out.println(tmpbook);
    }

    // метод не допускает запись дублей номеров в один ключ
    boolean phoneInBook(String name, String phone) {
        for (String item : tmpbook.get(name)) {
            if (item.equals(phone)) {
                return false;
            }
        }
        return true;
    }
}
