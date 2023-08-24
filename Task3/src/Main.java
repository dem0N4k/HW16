import java.util.Scanner;

public class Main {
    private static final String VALID = "((([А-яёЁ]+)|([А-яёЁ-]+))\\s){2}(([А-яёЁ]+)|([А-яёЁ-]+))";

    public static void main(String[] args) {
        System.out.println("Введите ФИО\n");
        //String man = new Scanner(System.in).nextLine().trim();
        String man = "Иванов Иван Иванович";

        if (man.matches(VALID)) {
           /* String lastName = man.substring(0, man.indexOf(' ')).trim();
            String firstName = man.substring(man.indexOf(' '), man.lastIndexOf(' ')).trim();
            String fatherName = man.substring(man.lastIndexOf(' ')).trim();*/

            String[] split = man.split("\\s");
            System.out.println("Фамилия: " + split[0] +
                    "\nИмя: " + split[1] +
                    "\nОтчество: " + split[2]);
        } else {
            System.out.println("Введенная строка не является ФИО");
        }


    }
}