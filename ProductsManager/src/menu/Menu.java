package menu;

import products.Products;
import productsManager.ProductsManager;

import java.util.Scanner;

public class Menu {
    ProductsManager productsManager = new ProductsManager();
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    public void showMenu() {
        int choice;

        do {
            System.out.println("=== Quản lý sản phẩm === \n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Tìm sản phẩm\n" +
                    "0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    menuAddProducts();
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    System.out.println("Nhập Id");
                    int id = inputInt.nextInt();
                    System.out.println(productsManager.findProductsById(id));
                    break;
            }
        } while (choice != 0);
    }
    public void menuAddProducts() {
        System.out.println("=== Menu Thêm Sản Phẩm ===");
        System.out.println("Nhập tên sản phẩm");
        String name = inputString.nextLine();
        System.out.println("Nhập gía sản phẩm");
        int price = inputInt.nextInt();
        System.out.println("Nhập hãng sản xuất");
        String manufacturers = inputString.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        String info = inputString.nextLine();
        Products products = new Products(name,price,manufacturers,info);
        productsManager.addProducts(products);
        System.out.println("Thêm sản phẩm thành công");
    }
    public void showAllProducts() {
        for (Products product: productsManager.getProductsList()) {
            System.out.println(product);
        }
    }
}
