package ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void addProduct(int newId, String newName, int newPrice) {
        products.add(new Product(newId, newName, newPrice));
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    public void changeProducts(int id, int newPrice, String newName) {
        products.get(id - 1).setPrice(newPrice);
        products.get(id - 1).setName(newName);
    }
    public void searchProduct(String name) {
     for (Product product : products) {
         if (product.getName().equals(name)) {
             System.out.println(product);
         }
     }
    }
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void sortProducts() {
        for (int i = 0; i < products.size(); i++) {
           for (int j = i + 1; j < products.size(); j++) {
               if (products.get(i).getPrice() > products.get(j).getPrice()) {
                   Collections.swap(products, i, j);
               }
           }
        }
    }



    public static void main(String[] args) {
        ProductManager productBought = new ProductManager();
        productBought.addProduct(1, "Milk", 10);
        productBought.addProduct(2, "Pepsi", 80);
        productBought.addProduct(3, "Coca", 30);
        productBought.addProduct(4, "Wake-Up 247", 42);
        productBought.removeProduct(2);
        productBought.displayProducts();
        productBought.changeProducts(3, 15, "Fanta");
        productBought.displayProducts();
        productBought.searchProduct( "Milk");
        productBought.sortProducts();
        productBought.displayProducts();
    }
}
