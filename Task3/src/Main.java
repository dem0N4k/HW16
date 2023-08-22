import java.util.Scanner;

public class Main {
    public static final String VALID = "()";

    public static void main(String[] args) {
       // String man = new Scanner(System.in).nextLine().trim();
        String man = "Иванов Иван Иванович";
        String lastName = man.substring(0, man.indexOf(' ')).trim();
        String firstName = man.substring(man.indexOf(' '), man.lastIndexOf(' ')).trim();
        String fatherName = man.substring(man.lastIndexOf(' ')).trim();
        System.out.println("Фамилия: " + lastName +
                             "\nИмя: " + firstName +
                            "\nОтчество: " + fatherName);
    }
}
