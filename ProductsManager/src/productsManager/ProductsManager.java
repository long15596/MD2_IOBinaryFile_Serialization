package productsManager;

import dto.ReadAndWrite;
import products.Products;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsManager {
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    private List<Products> productsList;
    private ReadAndWrite readAndWrite;

    public ProductsManager() {
        File file = new File("ProductsManager/products.dat");
        if (file.exists()){
            this.productsList = ReadAndWrite.readFile("ProductsManager/products.dat");
        } else {
            this.productsList = new ArrayList<>();
        }

    }
    public void addProducts(Products products) {
        productsList.add(products);
        ReadAndWrite.writeFile(productsList,"ProductsManager/products.dat");
    }
    public List<Products> getProductsList() {
        return this.productsList;
    }
    public Products findProductsById(int id){
        for (Products product: productsList) {
            if(id == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
