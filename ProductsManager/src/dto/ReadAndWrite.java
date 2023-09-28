package dto;

import products.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(List<Products> products, String path) {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static List<Products> readFile(String path) {
        List<Products> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Products>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return products;
    }
}
