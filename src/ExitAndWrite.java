import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ExitAndWrite {
    public static void exitAndWrite(Map<String, String> dictionary, String dictionaryFile) throws InterruptedException {
        try {
            FileWriter myWriter = new FileWriter(dictionaryFile);
            for (Map.Entry<String, String> entry : dictionary.entrySet())
                myWriter.write(entry.getKey() + "-" + entry.getValue() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.print("Exit");
        Delay.delay();
    }
}
