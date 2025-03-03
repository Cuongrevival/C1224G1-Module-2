import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("country.csv"));
            printCountry(br);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printCountry(BufferedReader br) throws IOException {
        String line;
        List<Country> countries = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String code = data[1];
            String name = data[2];
            countries.add(new Country(id, code, name));
            for (Country country : countries) {
                if (country.getId() == id) {
                    country.setId(id);
                    country.setCode(code);
                    country.setName(name);
                    break;
                }
            }
        }
        System.out.println(countries);
    }
}