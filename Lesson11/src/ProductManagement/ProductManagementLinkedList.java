package ProductManagement;

import java.util.Collections;
import java.util.LinkedList;

public class ProductManagementLinkedList {
    LinkedList<Product> productList = new LinkedList<>();

    public void addProduct(int newId, String newName, int newPrice) {
        productList.add(new Product(newId, newName, newPrice));
    }
    public void removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }
    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product.getId() + " "
                    + product.getName() + " "
                    + product.getPrice());
        }
    }
    public void sortProductsByPrice() {
        for (int i = 0; i < productList.size(); i++) {
            for (int j = i + 1; j < productList.size(); j++) {
                if (productList.get(i).getPrice() > productList.get(j).getPrice()) {
                    Product temp = productList.get(i);
                    productList.set(i, productList.get(j));
                    productList.set(j, temp);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        ProductManagementLinkedList list = new ProductManagementLinkedList();
        list.addProduct(1, "Guitar", 400);
        list.addProduct(2, "Violin", 300);
        list.addProduct(3, "Piano", 500);
        list.addProduct(4, "Trumpet", 250);
        list.displayProducts();
        list.sortProductsByPrice();
        list.displayProducts();
    }
}
