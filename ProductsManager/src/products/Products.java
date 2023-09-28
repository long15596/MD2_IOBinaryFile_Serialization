package products;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String name;
    private int price;
    private String manufacturers;
    private String info;
    private static int idIncrement = 1;
    public Products(String name, int price, String manufacturers, String info) {
        this.id = idIncrement;
        this.name = name;
        this.price = price;
        this.manufacturers = manufacturers;
        this.info = info;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setCode(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturers='" + manufacturers + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
