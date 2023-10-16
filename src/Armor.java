public class Armor {
    private String name;
    private String[] armorNames = {"cloth", "silver", "gold", "diamond", "Hermes", "Artemis", "Ares", "Poseidon"};
    private int health;
    private int[] armorHealth = {10,20,30,40,50};

    private int price;
    private int[] armorprice = {10,20,30,40,50};

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }







}
