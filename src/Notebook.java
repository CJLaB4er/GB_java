public class Notebook {

    private String model, brand, system, type;
    private int ram, rom, price;
    private  float size;

    public Notebook(String model, String brand, float size, int ram, int rom, String system, int price, String type) {
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.ram = ram;
        this.rom = rom;
        this.system = system;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "брэнд='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", размер='" + size + '\'' +
                ", оперативная память='" + ram + '\'' +
                ", постоянная память='" + rom + '\'' +
                ", операционная система='" + system + '\'' +
                ", цена='" + price + '\'' +
                ", тип='" + type + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getSystem() {
        return system;
    }

    public String getType() {
        return type;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public int getPrice() {
        return price;
    }

    public float getSize() {
        return size;
    }

    public String getInfo(){
        return "Модель: "+ model + ", Бренд: " + brand + ", Размер экрана: " + size + ", Размер оперативной памяти: "
                + ram + ", Размер жесткого диска: " + rom + ", Установленная операционная система: "
                + system + ", Цена: " + price + ", Тип ноутбука: " + type;
    }
}
