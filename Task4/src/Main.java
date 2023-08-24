import java.util.Scanner;

public class Main {
    private static String VALID_FIRST = "(\\d{11})";
    private static String VALID_SECOND = "(\\d{10})";
    private static String NUMBER = "(\\d{1})(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static String NUMBER_FORMAT = "+$1 ($2) $3 $4-$5";

    public static void main(String[] args) {
        metod();
    }

    public static void metod() {
        System.out.println("Введите номер телефона\n");
        String number = new Scanner(System.in).nextLine();
        //String number = "8-905-1234567";
        number = number.replaceAll("\\D", "");
        //System.out.println(number + "\n");
        if (number.matches(VALID_FIRST)) {                   // (number.length()) == 11)
            if (number.charAt(0) == '7') {
                print(number);
            } else if (number.charAt(0) == '8') {
                number = number.replaceFirst("8", "7");
                print(number);
            } else {
                error();
            }
        } else if (number.matches(VALID_SECOND)) {             // (number.length()) == 10)
            number = "7" + number;
            print(number);
        } else {
            error();
        }
    }

    public static void error() {
        System.out.println("Неверный формат номера");
    }

    public static void print(String number) {
        number = number.replaceAll(NUMBER, NUMBER_FORMAT);
        System.out.println("Номер " + number + " сохранен");
    }
}
