package Download;

public class FileDownloader implements Downloader{
    String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String path) {
        System.out.println("Downloading " + path);
        System.out.println("User-Agent: " + userAgent);
    }
}
