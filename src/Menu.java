import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void start(int chose) {
        Character character = new Character();

        switch (chose) {
            case 1:
                character = character.karakterOlustur();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public static void mainMenu() {
        System.out.println("karakter seçimi için ---> 1");
        System.out.println("Mağazaya gitmek için ---> 2");
        System.out.println("Savaş alanına gitmek için ---> 3");
        int seçim = scanner.nextInt();
        start(seçim);
    }
}
