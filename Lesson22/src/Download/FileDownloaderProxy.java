package Download;

public class FileDownloaderProxy implements Downloader{
    private static final String FIREFOX_USER_AGENT = "Mozilla Firefox/5.0";
    private final FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader(FIREFOX_USER_AGENT);
    }

    @Override
    public void download(String path) {
        fileDownloader.download(path);
    }
}
