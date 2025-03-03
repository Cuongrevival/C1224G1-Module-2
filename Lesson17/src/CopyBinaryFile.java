import java.util.Scanner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyBinaryFile {
    private static void copyFileUsingJava7Files(File source, File destination) throws IOException {
        Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingSteam(File source, File destination) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = Files.newInputStream(source.toPath());
            out = Files.newOutputStream(destination.toPath());
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert in != null;
            in.close();
            assert out != null;
            out.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source File: ");
        String sourceFile = sc.nextLine();
        System.out.print("Enter Destination File: ");
        String destinationFile = sc.nextLine();
        File source = new File(sourceFile);
        File destination = new File(destinationFile);
        try {
            copyFileUsingJava7Files(source, destination);
            System.out.println("Source File Copied!");
        } catch (IOException e) {
            System.err.println("Source File Not Copied!");
            e.printStackTrace();
        }
    }
}
