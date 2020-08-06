import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ReadFromFile {
    public static Map<String,String>readFromFile(String dictionaryFile) throws InterruptedException {

        BufferedReader br = null;
        String line = "";
        String splitBy = "-";

        Map<String, String> dictionary = new TreeMap<>();

        try {
            br = new BufferedReader(new FileReader(dictionaryFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] dict = line.split(splitBy);

                dictionary.put(dict[0], dict[1]);
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.print("Loading");
        Delay.delay();
        return dictionary;
    }
}
