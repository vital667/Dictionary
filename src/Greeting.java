import java.util.Scanner;

public class Greeting {
    public static char greeting(){
        Scanner scanner = new Scanner(System.in);
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
        return c;
    }
}
