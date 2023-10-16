import java.util.Scanner;

public class Arm {

    private String name;
    public String[] armName = {"Tahta Yay", "Bronz Yay", "Wood", "Iron", "Steel", "Tıtan", "Obsidian", "Mithril"};
    private ArmClass armClass;
    private int damage;
    public int[] armDamage = {10, 20, 30, 40, 50, 60, 70, 80};
    private int price;
    public int[] armPrice = {10, 20, 25, 30, 40, 45, 55, 60};



    public Arm(String name, int health, int price) {
        this.setName(name);

        this.setDamage(health);
        this.setPrice(price);
    }

    public Armor listele() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("1-> armor name : Cloth ");
        System.out.println("    armor health : 10");
        System.out.println("    armor price : 10");
        System.out.println();
        System.out.println("2-> armor name : Leather ");
        System.out.println("    armor health : 20");
        System.out.println("    armor price : 20");
        System.out.println();
        System.out.println("3-> armor name : Wood ");
        System.out.println("    armor health : 30");
        System.out.println("    armor price : 25");
        System.out.println();
        System.out.println("4-> armor name : Iron ");
        System.out.println("    armor health : 40");
        System.out.println("    armor health : 30");
        System.out.println();
        System.out.println("5-> armor name : Steel ");
        System.out.println("    armor health : 50");
        System.out.println("    armor price : 40");
        System.out.println();
        System.out.println("6-> armor name : Titan ");
        System.out.println("    armor health : 60");
        System.out.println("    armor price : 45");
        System.out.println();
        System.out.println("7-> armor name : Obsidian ");
        System.out.println("    armor health : 70");
        System.out.println("    armor price : 55");
        System.out.println();
        System.out.println("8-> armor name : Mithril ");
        System.out.println("    armor health : 80");
        System.out.println("    armor price : 60");
        System.out.println();
        System.out.println("bir zırh seçiniz");
        System.out.println("geri çıkmak için --> 10");
        int value = scanner.nextInt();
        if (value == 10) {
            menu.mainMenu();
        }
        Armor armor = new Armor(armName[value - 1], armDamege[value - 1], armPrice[value - 1]);
        return armor;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArmClass getArmClass() {
        return armClass;
    }

    public void setArmClass(ArmClass armClass) {
        this.armClass = armClass;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
