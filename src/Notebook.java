public class Notebook {

    private String model, brand, size, ram, rom, system, price, type;

    public Notebook(String model, String brand, String size, String ram, String rom, String system, String price, String type) {
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
        return model + "{" +
                "брэнд='" + brand + '\'' +
                ", размер='" + size + '\'' +
                ", оперативная память='" + ram + '\'' +
                ", постоянная память='" + rom + '\'' +
                ", операционная система='" + system + '\'' +
                ", цена='" + price + '\'' +
                ", тип='" + type + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getSystem() {
        return system;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getInfo(){
        return model + ", " + brand + ", " + size + ", " + ram + ", " + rom + ", " + system + ", " + price + ", " + type;
    }
}
