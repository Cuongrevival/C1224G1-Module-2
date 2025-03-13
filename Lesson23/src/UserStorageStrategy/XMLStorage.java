package UserStorageStrategy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLStorage implements UserStorage {
    private static final String FILE_PATH = "users.xml";

    @Override
    public void store(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write("<user><name>" + user.getName() + "</name><age>" + user.getAge() + "</age></user>\n");
            System.out.println("User stored in XML file.");
        } catch (IOException e) {
            System.err.println("Error writing to XML file: " + e.getMessage());
        }
    }
}
