package UserStorageStrategy;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", 25);

        UserController xmlController = new UserController(new XMLStorage());
        xmlController.store(user);

        UserController mysqlController = new UserController(new MySQLStorage());
        mysqlController.store(user);
    }
}
