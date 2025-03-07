import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class SongList {
    public static void main(String[] args) {
        try {
            URL songUrl = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(songUrl.openStream()));
            scanner.useDelimiter("\\Z");
            String title = scanner.next();
            scanner.close();
            title = title.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(title);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
