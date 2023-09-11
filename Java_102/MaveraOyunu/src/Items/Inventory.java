package Items;

import java.util.ArrayList;

public class Inventory {
    private Weapon weapon;
    private Armor armor;

    private ArrayList<String> awardList;

    public Inventory (){
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor = new Armor("Paçavra",-1,0,0);
        this.awardList = new ArrayList<>();
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

    public ArrayList<String> getAwardList() {
        return awardList;
    }

    public void setAwardList(String awardList) {
        this.awardList.add(awardList);
    }
}
