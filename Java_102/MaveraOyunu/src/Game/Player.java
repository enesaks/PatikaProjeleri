package Game;

import Chracter.Archer;
import Chracter.GameCharacter;
import Chracter.Knight;
import Chracter.Samurai;
import Items.Inventory;

import java.util.Scanner;

public class Player {

    private Inventory inventory;
    private int damage;
    private int healt;
    private int money;
    private String cahrecterName;
    private String name;

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter(){
        Scanner scanner = new Scanner(System.in);
        GameCharacter[] gameCharacter = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karekter Seçiniz");

        for (GameCharacter character: gameCharacter){
            System.out.printf("%d.Karakter : %10s \tHasar : %d\tSağlık : %d\tPara : %d\n"
                    ,character.getId()
                    ,character.getName()
                    ,character.getDamage()
                    ,character.getHealt()
                    ,character.getMoney());
        }


        System.out.print("Seçim : ");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
               initPlayer(new Knight());
                break;
            default:
                break;
        }



    }

    public void initPlayer(GameCharacter character){
        this.setCahrecterName(character.getName());
        this.setHealt(character.getHealt());
        this.setDamage(character.getDamage());
        this.setMoney(character.getMoney());
    }
    public void printInfo(){
        System.out.printf("\nSilah : %s | Armor : %s | Bloklama : %d | Hasarınız : %d | Sağlık : %d | Para : %d\n"
                ,getInventory().getWeapon().getName()
                ,getInventory().getArmor().getName()
                ,getInventory().getArmor().getBlock()
                ,getDamage()
                ,getHealt()
                ,getMoney());
    }

    public int getHealt() {
        return healt ;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage + inventory.getWeapon().getDamage();
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

    public String getCahrecterName() {
        return cahrecterName;
    }

    public void setCahrecterName(String cahrecterName) {
        this.cahrecterName = cahrecterName;
    }
}
