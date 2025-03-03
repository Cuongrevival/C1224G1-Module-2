import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            br.close();
            System.out.println("Sum is: " + sum);

        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path here: ");
        String path = sc.nextLine();
        ReadFileExample rf = new ReadFileExample();
        rf.readFileText(path);

    }
}
