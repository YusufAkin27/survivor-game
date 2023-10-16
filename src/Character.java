import java.util.Random;

public class Character {
    private String name;
    private String[] characterNames = {"Zeus", "Hera", "Athena", "Apollo", "Hermes", "Artemis", "Ares", "Poseidon"};
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


    // Rastgele bir karakter adı seçen fonksiyon
    private String getRandomCharacterName() {
        Random random = new Random();
        int index = random.nextInt(characterNames.length);
        return characterNames[index];
    }

    // Rastgele karakter özellikleri oluşturan fonksiyon
    public Character karakterOlustur() {
        Random random = new Random();
        Character character = new Character();
        character.setName(getRandomCharacterName());
        character.setHealth(random.nextInt(50) + 50); // 1 ile 100 arasında rastgele bir can sağlık değeri
        character.setDamage(random.nextInt(10) + 10); // 1 ile 20 arasında rastgele bir hasar değeri
        character.setMoney(0); // 1 ile 1000 arasında rastgele bir para değeri
        character.setArm(null); // Silah nesnesi oluşturulabilir
        character.setArmor(null); // Zırh nesnesi oluşturulabilir

        System.out.println("Karakter Adı: " + character.getName());
        System.out.println("Sağlık: " + character.getHealth());
        System.out.println("Hasar: " + character.getDamage());
        System.out.println("Para: " + character.getMoney());
        System.out.println("Silah: " +character.getArm());
        System.out.println("Zırh: " + character.getArmor());
        return character;
    }
    public void karakterInfo(Character character){
        System.out.println();
        System.out.println("Karakter Adı: " + character.getName());
        System.out.println("Sağlık: " + character.getHealth());
        System.out.println("Hasar: " + character.getDamage());
        System.out.println("Para: " + character.getMoney());
        System.out.println("Silah: " +character.getArm());
        System.out.println("Zırh: " + character.getArmor());
    }




}


