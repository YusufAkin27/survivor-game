import java.util.Scanner;

public class Story {
    Scanner scanner = new Scanner(System.in);
    Armor armor = new Armor();
    Menu menu = new Menu();

    public void storyMenu(Character character) {
        System.out.println("zırhları listelemek için --> 1");
        System.out.println("silahları listelemek için --> 2");
        System.out.println("yetenekleri listelemek için --> 3");
        System.out.println("Ana Menüye dönmek için --> 4");
        int value = scanner.nextInt();
        satınAl(character, value);
    }

    private Character satınAl(Character character, int value) {
        switch (value) {
            case 1:
                // önce tüm zırhları görmem lazım
                // satım alımı yapıcaksa
                armor=armor.listele();
                if (armor.getPrice()<=character.getMoney()){
                    //satın alabilir karakterin parası yeterli
                }
                else {
                    System.out.println("karakterin parası yetersiz");
                    storyMenu(character);
                }
                break;
            case 2:

                // bahar yapıcak
                break;
            case 3:
                break;
            case 4:
                menu.mainMenu();
            default:
                System.out.println("hatalı tuşlama yaptınız");
                storyMenu(character);
                break;
        }
        return null;
    }

}
