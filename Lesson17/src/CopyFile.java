import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("start.bin"));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("end.bin"));
        ) {
            byte[] bytes = new byte[1024];
            int read;
            while ((read = ois.read(bytes)) != -1) {
                oos.write(bytes, 0, read);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
