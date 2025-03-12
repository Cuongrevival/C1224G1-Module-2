import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    private static final String FILE_NAME = "product.txt";
    private static List<Product> products;

    public ProductFile() {
        products = loadProducts();
    }

    public List<Product> loadProducts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        BufferedInputStream fis;
        try {
            fis = new BufferedInputStream(new FileInputStream(file));
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (List<Product>) ois.readObject();
        }catch (EOFException e) {
            return new ArrayList<>();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void saveProducts(List<Product> products) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        saveProducts(products);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                System.out.println(product);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ProductFile productFile = new ProductFile();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("PRODUCT MANAGEMENT");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
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
                    productFile.addProduct(new Product(productId, productName, productPrice,
                            productManufacturer, productDescription));
                    break;
                case 2:
                    productFile.displayProducts();
                    break;
                case 3:
                    System.out.println("Enter product ID: ");
                    String id = scanner.next();
                    productFile.searchProduct(id);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }
}