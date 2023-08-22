import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(metod(text));

    }

    public static String metod(String text) {
       return text.replaceAll("\\W+", "\n").trim();
    }

}