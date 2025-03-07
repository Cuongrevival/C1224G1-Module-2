import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class NewsList {
    public static void main(String[] args) {
        try {
            URL newsUrl = new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner sc = new Scanner(new InputStreamReader(newsUrl.openStream()));
            sc.useDelimiter("\\Z");
            String title = sc.next();
            sc.close();
            Pattern p = Pattern.compile("<h3 class=\\\\\"article-title\\\\\">.*?<a href=\\\\\"(.*?)\\\\\".*?>(.*?)</a>\", Pattern.DOTALL");
            Matcher m = p.matcher(title);
            if (m.find()) {
                System.out.println(m.group(1));
            } else {
                System.out.println("Không có bản tin");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
