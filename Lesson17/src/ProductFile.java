import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    private static final String FILE_NAME = "product.txt";
    private List<Product> productList;

    public ProductFile() {
        productList = loadProduct();
    }
    private List<Product> loadProduct() {

        File file = new File(FILE_NAME);
        if (file.exists()) {
            return new ArrayList<>();
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            return (List<Product>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProducts(Product product) {
        productList.add(product);
        saveProducts();
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void getProduct(String productId) {
        for (Product product : productList) {
            if (product.getId().equals(productId)) {
                System.out.print("Product found in ID: ");
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found");
    }

    public static void main(String[] args) {
        ProductFile productFile = new ProductFile();
        while (true) {
            System.out.println("PRODUCT MANANGEMENT");
            System.out.println("1. Add product");
            System.out.println("2. Display products");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter product ID: ");
                    String productId = scanner.next();
                    System.out.println("Enter product name: ");
                    String productName = scanner.next();
                    System.out.println("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.println("Enter product manufacturer: ");
                    String productManufacturer = scanner.next();
                    System.out.println("Enter product description: ");
                    String productDescription = scanner.next();
                    productFile.addProducts(new Product(productId, productName, productPrice, productManufacturer, productDescription));
                    break;
                case 2:
                    productFile.displayProducts();

                    break;
                case 3:
                    System.out.println("Enter product ID: ");
                    String id = scanner.next();
                    productFile.getProduct(id);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}


