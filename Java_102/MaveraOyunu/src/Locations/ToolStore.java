package Locations;

import Game.Player;
import Items.Armor;
import Items.Weapon;

public class ToolStore extends Location{
    public ToolStore(Player player) {
        super(2,player, "Mağaza","Buradan silah veya zırh satın alabilirsiniz.");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu){

        System.out.println("------------Mağazaya Hoşgeldiniz--------------");
        System.out.println("1.Silahlar..");
        System.out.println("2.Zırhlar..");
        System.out.println("3.Çıkış Yap!!");

        System.out.print("İşlem seçiniz : ");
        int select = scanner.nextInt();

        while (select < 1 || select > 3){
            System.out.print("Lütfen geçerli bir değer giriniz : ");
            select = scanner.nextInt();
        }

        switch (select){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz :)");
                showMenu = false;
                break;
        }

        }
        return true;
    }

    public void printWeapon(){

        System.out.println("-------------- Silahlar --------------");

        for (Weapon weopon: Weapon.weapons()){
            System.out.printf("%d.%10s | Hasar : %d | Ücreti : %d\n"
                    ,weopon.getId()
                    ,weopon.getName()
                    ,weopon.getDamage()
                    ,weopon.getPrice());
        }

        System.out.println("0- Çıkış Yap!");
    }

    public void buyWeapon() {



        System.out.print("Seçmek istediğiniz silahı giriniz : ");
        int select = scanner.nextInt();

        while (select < 0 || select > 3){
            System.out.print("Lütfen geçerli bir değer giriniz : ");
            select = scanner.nextInt();
        }

        if (select != 0){
            Weapon selectedWeapon = Weapon.getWeopenObjByID(select);

            if (selectedWeapon != null) {
                if (getPlayer().getMoney() >= selectedWeapon.getPrice()) {
                    //Satın Alma İşlemi...
                    System.out.println(selectedWeapon.getName() + " satın alındı");
                    int balance = getPlayer().getMoney() - selectedWeapon.getPrice();
                    getPlayer().setMoney(balance);

                    getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız "+ getPlayer().getInventory().getWeapon().getName());

                    System.out.println("Kalan Paranız : " + getPlayer().getMoney());
                } else {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
            }
        }

    }
    public void printArmor(){

        System.out.println("-------------- Armorlar --------------");

        for (Armor armor: Armor.armors()){
            System.out.printf("%d.%10s | Engelleme : %d | Ücreti : %d\n"
                    ,armor.getId()
                    ,armor.getName()
                    ,armor.getBlock()
                    ,armor.getPrice());
        }
        System.out.println("0- Çıkış Yap!");
    }
    public void buyArmor(){
        System.out.print("Seçmek istediğiniz armoru giriniz : ");
        int select = scanner.nextInt();

        while (select < 0 || select > 3){
            System.out.print("Lütfen geçerli bir değer giriniz : ");
            select = scanner.nextInt();
        }

        if (select != 0){
            Armor selectedArmor = Armor.getArmorObjByID(select);

            if (selectedArmor != null) {
                if (getPlayer().getMoney() >= selectedArmor.getPrice()) {
                    //Satın Alma İşlemi...
                    System.out.println(selectedArmor.getName() + " satın alındı");
                    int balance = getPlayer().getMoney() - selectedArmor.getPrice();
                    getPlayer().setMoney(balance);

                    getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Armorunuz "+ getPlayer().getInventory().getArmor().getName());

                    System.out.println("Kalan Paranız : " + getPlayer().getMoney());
                } else {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
            }
        }


    }

}
