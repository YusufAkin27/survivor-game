public class Character {
    private String name;
    private String[] Class = {"Archer", "SwordMan", "MartialArtist", "Mage"};
    private int healty;
    private int damage;
    private int money;
    private Arm arm;//silah
    private Armor armor;//zırh


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(String name, int healty, int damage, int money) {
        this.name = name;
        this.healty = healty;
        this.damage = damage;
        this.money = money;
    }


    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
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
}


