import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String dictionaryDataBase = "Dictionary.txt";
        Map<String, String> dictionary = ReadFromFile.readFromFile(dictionaryDataBase);

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {

            switch (Greeting.greeting()) {
                case 's':
                    for (Map.Entry<String, String> entry : dictionary.entrySet())
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    break;

                case 'f':
                    System.out.println("Enter polish word you want to change:");
                    String word = scanner.next();
                    if (dictionary.containsKey(word.toLowerCase())) System.out.println(dictionary.get(word));
                    else System.out.println("This word doesn't exist. Try once again");
                    break;

                case 'c':
                    System.out.println("Enter polish word you want to change:");
                    word = scanner.next();
                    if (!dictionary.containsKey(word.toLowerCase())) {
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
                    if (dictionary.containsKey(word.toLowerCase())) {
                        dictionary.remove(word.toLowerCase());
                        System.out.println("Deleted completed");
                        break;
                    } else {
                        System.out.println("This word doesn't exist. Try once again");
                        break;
                    }

                case 'a':
                    System.out.println("Enter Polish word");
                    String polishWord = scanner.next();
                    if (dictionary.containsKey(polishWord.toLowerCase())) {
                        System.out.println("This word already exist. Try once again");
                        break;
                    }
                    System.out.println("Enter English word");
                    englishWord = scanner.next();
                    dictionary.put(polishWord.toLowerCase(), englishWord.toLowerCase());
                    break;

                case 'q':
                    flag = false;
                    ExitAndWrite.exitAndWrite(dictionary, dictionaryDataBase);
                    break;

                default:
                    System.out.println("***Wrong! ___Try once again___***");
                    break;
            }
        }
    }
}
