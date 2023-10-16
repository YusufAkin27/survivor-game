import java.util.Random;
import java.util.Scanner;

public class Character {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private CharacterClasses characterClasses;//sınıf
    private int health;
    private int damage;
    private int money;
    private Arm arm;//silah
    private Armor armor;//zırh

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



    // Rastgele karakter özellikleri oluşturan fonksiyon
    public Character karakterOlustur() {
        Random random = new Random();
        Character character = new Character();
        System.out.print("Karakter ismi giriniz: ");
        character.setName(scanner.next());
        System.out.println("karakter için sınıf seçin:\n1-Okçu\n2-Kılıç Ustası\n3-Dövüş Sanatçısı\n4-Büyücü\n(Sayı giriniz)");
        int choose;

        do{
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    character.setCharacterClasses(CharacterClasses.values()[choose-1]);// Sınıf Seçimi
                    character.setHealth(30); // Sağlığın belirlenmesi
                    character.setDamage(25); // Hasarın belirlenmesi
                    character.setMoney(0);
                    character.setArm(Arm.values()[choose-1]); // Silah nesnesi oluşturulabilir
                    character.setArmor(null); // Zırh nesnesi oluşturulabilir
                    break;
                case 2:
                    character.setCharacterClasses(CharacterClasses.values()[choose-1]);
                    character.setHealth(60); // Sağlığın belirlenmesi
                    character.setDamage(20); // Hasarın belirlenmesi
                    character.setMoney(0);
                    character.setArm(Arm.values()[choose-1]); // Silah nesnesi oluşturulabilir
                    character.setArmor(null); // Zırh nesnesi oluşturulabilir
                    break;
                case 3:
                    character.setCharacterClasses(CharacterClasses.values()[choose-1]);
                    character.setHealth(70); // Sağlığın belirlenmesi
                    character.setDamage(15); // Hasarın belirlenmesi
                    character.setMoney(0);
                    character.setArm(Arm.values()[choose-1]); // Silah nesnesi oluşturulabilir
                    character.setArmor(null); // Zırh nesnesi oluşturulabilir
                    break;
                case 4:
                    character.setCharacterClasses(CharacterClasses.values()[choose-1]);
                    character.setHealth(20); // Sağlığın belirlenmesi
                    character.setDamage(30); // Hasarın belirlenmesi
                    character.setMoney(0);
                    character.setArm(Arm.values()[choose-1]); // Silah nesnesi oluşturulabilir
                    character.setArmor(null); // Zırh nesnesi oluşturulabilir
                    break;
                default:
                    System.out.println("Geçersiz değer tekrar girin");

                    break;
            }
        }while (choose>4 || choose<1);


        System.out.println("Karakter Adı: " + character.getName());
        System.out.println("Sağlık: " + character.getHealth());
        System.out.println("Sınıf: "+ character.getCharacterClasses());
        System.out.println("Hasar: " + character.getDamage());
        System.out.println("Para: " + character.getMoney());
        System.out.println("Silah: " + character.getArm());
        System.out.println("Zırh: " + character.getArmor());
        return character;
    }

    public void karakterInfo(Character character) {
        System.out.println();
        System.out.println("Karakter Adı: " + character.getName());
        System.out.println("Sınıf: " + character);
        System.out.println("Sağlık: " + character.getHealth());
        System.out.println("Hasar: " + character.getDamage());
        System.out.println("Para: " + character.getMoney());
        System.out.println("Silah: " + character.getArm());
        System.out.println("Zırh: " + character.getArmor());
    }


    public CharacterClasses getCharacterClasses() {
        return characterClasses;
    }

    public void setCharacterClasses(CharacterClasses characterClasses) {
        this.characterClasses = characterClasses;
    }
}


