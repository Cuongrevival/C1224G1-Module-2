package Download;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter link: ");
        String link = sc.nextLine();
        Downloader downloader = new FileDownloaderProxy();
        downloader.download(link);
    }
}
