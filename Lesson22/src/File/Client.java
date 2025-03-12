package File;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }
    public void printFileSize(String path) {
        long fileSize = fileCalculator.calculateSize(path);
        System.out.println("File size : " + fileSize);
    }
}
