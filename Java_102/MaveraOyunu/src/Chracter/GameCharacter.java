package Chracter;

public abstract class GameCharacter {

    private String name;
    private int damage;
    private int healt;
    private int money;
    private int id;

    public GameCharacter(String name, int damage, int healt, int money, int id) {
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.money = money;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
