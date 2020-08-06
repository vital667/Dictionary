import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.print("Loading");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.println();


        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("mama", "mother");
        dictionary.put("dom", "house");
        dictionary.put("kot", "cat");
        dictionary.put("ptak", "bird");

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("____________________________________");
            System.out.println("Enter a letter what you want to do: " +
                    "\n'a' - add new word" +
                    "\n'q' - quit" +
                    "\n's' - show all the dictionary" +
                    "\n'f' - find a polish word" +
                    "\n'd' - delete a word (enter polish word)" +
                    "\n'c' - change existing");
            String s = scanner.next();
            char c = s.charAt(0);
            switch (c) {
                case 's':
                    for (Map.Entry<String, String> entry : dictionary.entrySet())
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    break;

                case 'q':
                    System.out.println("Exit...");
                    flag = false;
                    break;

                case 'f':
                    System.out.println("Enter polish word you want to change:");
                    String word = scanner.next();
                    if (dictionary.containsKey(word)) System.out.println(dictionary.get(word));
                    else System.out.println("This word doesn't exist. Try once again");
                    break;

                case 'c':
                    System.out.println("Enter polish word you want to change:");
                    word = scanner.next();
                    if (!dictionary.containsKey(word)) {
                        System.out.println("This word doesn't exist. Try once again");
                        break;
                    }
                    System.out.println("Enter English word");
                    String englishWord = scanner.next();
                    dictionary.put(word, englishWord);
                    break;

                case 'd':
                    System.out.println("Enter polish word you want to delete:");
                    word = scanner.next();
                    if (dictionary.containsKey(word)) {
                        dictionary.remove(word);
                        System.out.println("Deleted completed");
                        break;
                    } else {
                        System.out.println("This word doesn't exist. Try once again");
                        break;
                    }

                case 'a':
                    System.out.println("Enter Polish word");
                    String polishWord = scanner.next();
                    if (dictionary.containsKey(polishWord)) {
                        System.out.println("This word already exist. Try once again");
                        break;
                    }
                    System.out.println("Enter English word");
                    englishWord = scanner.next();
                    dictionary.put(polishWord, englishWord);
                    break;

                default:
                    System.out.println("***Wrong! ___Try once again___***");
                    break;
            }
        }
    }
}
