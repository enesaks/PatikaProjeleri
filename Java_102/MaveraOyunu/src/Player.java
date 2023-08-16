import java.util.Scanner;

public class Player {

    private Inventory inventory;
    private int damage;
    private int healty;
    private int money;
    private String cahrecterName;
    private String name;

    public Player(String name){
        this.name = name;
    }

    public void selectCharacter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Karekter Seçiniz");
        System.out.println("1.Samuray | Hasar : 5 | Sağlık : 21 | Para : 15\n2.Okçu    | Hasar : 7 | Sağlık : 18 | Para : 20\n3.Şovalye | Hasar : 8 | Sağlık : 24 | Para : 5 ");

        System.out.print("Seçim : ");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                damage = 5;
                healty = 21;
                money = 15;
                cahrecterName = "Samuray";
                System.out.println("Karekteriniz : Samuray");
                break;
            case 2:
                damage = 7;
                healty = 18;
                money = 20;
                cahrecterName = "Okçu";
                System.out.println("Karekteriniz : Okçu");
                break;
            case 3:
                damage = 8;
                healty = 24;
                money = 5;
                cahrecterName = "Şovalye";
                System.out.println("Karekteriniz : Şovalye");
                break;
            default:
                break;
        }



    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
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
