import java.io.*;

public class CopyText {
    public void copyText() {
        try (BufferedReader br = new BufferedReader(new FileReader("start.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("end.txt"))){

            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                count += line.length();
            }
            System.out.println("Number of characters: " + count);
            System.out.println("Copy successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CopyText copyText = new CopyText();
        copyText.copyText();
    }

}
