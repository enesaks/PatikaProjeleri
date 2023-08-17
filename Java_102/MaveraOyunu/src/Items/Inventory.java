package Items;

public class Inventory {
    private Weapon weapon;
    private Armor armor;

    public Inventory (){
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor = new Armor("Paçavra",-1,0,0);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
