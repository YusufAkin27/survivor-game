import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public static void start() {
        Character character = new Character();
        character = character.karakterOlustur();
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("Mağazaya gitmek için ---> 1");
        System.out.println("Savaş alanına gitmek için ---> 2");
        int choose = scanner.nextInt();
        // esra yapıcak
        //karakter seçimi

    }
}
