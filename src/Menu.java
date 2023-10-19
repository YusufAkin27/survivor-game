import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static Story story = new Story();

    public static void start() {
        Character character = new Character();
        character = character.karakterOlustur();
        mainMenu(character);

    }

    public static void mainMenu(Character character) {
        System.out.println("Mağazaya gitmek için ---> 1");
        System.out.println("Savaş alanına gitmek için ---> 2");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                story.storyMenu(character);
                break;
            case 2:
                break;
            default:
                System.out.println("hatalı tuşlama yaptınız");
                mainMenu(character);
        }
        // esra yapıcak
        //karakter seçimi

    }
}
