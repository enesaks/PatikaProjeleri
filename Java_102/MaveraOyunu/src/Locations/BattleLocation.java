package Locations;

import Chracter.Obstacle;
import Game.Player;
import Items.Armor;
import Items.Weapon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public  class BattleLocation extends Location{

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;



    public BattleLocation(int id, Player player, String name, Obstacle obstacle, String award, String info,int maxObstacle) {
        super(id, player, name, info);
        this.award = award;
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {

        if (awardControl()){
            System.out.println("Daha önce bitrdiniz.");
            System.out.println("Giremezsiniz !!");
            return true;
        }

        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatlı Ol! Burada : "+obsNumber+" tane " + this.getObstacle().getName() + " yaşıyor !!!");
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = scanner.nextLine().toUpperCase();

        if (selectCase.equals("S") && combat(obsNumber)){
            System.out.println(this.getName() + " tum düşmanları temizledin.");
            return true;
        }

        if (this.getPlayer().getHealt() <= 0){
            System.out.println("Öldünüz.");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber){
        int awardNumber = obsNumber;

        for (int i = 1; i <= obsNumber; i++ ){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());

            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealt() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<V>ur veya <K>aç : ");
                String selectCase = scanner.nextLine().toUpperCase();

                Random random = new Random();
                int hitChance = random.nextInt(2) ;

                if (this.getObstacle().getHealth() > 0 && hitChance == 0){
                    System.out.println();
                    System.out.println("Canavar Size Vurdu !");
                    int obstacleDemage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDemage < 0 ){
                        obstacleDemage = 0;
                    }

                    this.getPlayer().setHealt(this.getPlayer().getHealt() - obstacleDemage);
                    afterHit();
                }

                if (selectCase.equals("V")){
                    System.out.println("Siz Vurdunuz ! ");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getObstacle().getHealth() > 0 && hitChance == 1){
                        System.out.println();
                        System.out.println("Canavar Size Vurdu !");
                        int obstacleDemage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDemage < 0 ){
                            obstacleDemage = 0;
                        }

                        this.getPlayer().setHealt(this.getPlayer().getHealt() - obstacleDemage);
                        afterHit();
                    }
                }
                else {
                    return false;
                }


            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealt()){
                System.out.println("Düşmanı Yendiniz !");
                if (this.getObstacle().getName().equals("Yılan")){
                    snakeItemDrop();

                }else{
                    System.out.println(this.getObstacle().getAward() + " para kazandınız.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                    System.out.println("Güncel paranız : " + this.getPlayer().getMoney());

                    awardNumber--;

                    if (awardNumber == 0){
                        System.out.println("Bölüm Ödülünü Kazandın...");
                        System.out.println("Ödül : " + getAward());
                        this.getPlayer().getInventory().setAwardList(getAward());
                    }
                }

            }

        }
        return false;
    }

    public boolean awardControl(){
        ArrayList<String> awardList = this.getPlayer().getInventory().getAwardList();

        for (String award: awardList) {
            if (getAward().equals(award)){
                return true;
            }
        }

        return false;
    }
    public void snakeItemDrop(){
        Random random = new Random();
        boolean itemDrop = random.nextInt(2) == 1;
        if (itemDrop){
            int itemChance = random.nextInt(5);
            System.out.println("Bir şey düştü...");
            switch (itemChance){
                case 0:
                    //Silah kazamna ihtimali
                    //Tüfek Kazanma İhtimali : 20%
                    //Kılıç Kazanma İhtimali : 30%
                    //Tabanca Kazanma İhtimali : 50%
                    int weaponChance = random.nextInt(9);
                    if (weaponChance == 0 || weaponChance == 1){
                        //Tüfek
                        this.getPlayer().getInventory().setWeapon(Weapon.getWeopenObjByID(3));
                        System.out.println("Tebrikler *Tufek* kazandınız");
                    } else if (weaponChance == 2 ||weaponChance == 3 ||weaponChance == 4) {
                        //Kılıç
                        this.getPlayer().getInventory().setWeapon(Weapon.getWeopenObjByID(2));
                        System.out.println("Tebrikler *Kılıç* kazandınız");
                    }else{
                        //Tabanca
                        this.getPlayer().getInventory().setWeapon(Weapon.getWeopenObjByID(1));
                        System.out.println("Tebrikler *Tabanca* kazandınız");
                    }


                    break;
                case 1:
                    //Armor kazamna ihtimali
                    //Ağır Zırh Kazanma İhtimali : 20%
                    //Orta Zırh Kazanma İhtimali : 30%
                    //Hafif Zırh Kazanma İhtimali : 50%
                    int armorChance = random.nextInt(9);
                    if (armorChance == 0 || armorChance == 1){
                        //ağır
                        this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
                        System.out.println("Tebrikler *Ağır Zırh* kazandınız");
                    } else if (armorChance == 2 || armorChance == 3 || armorChance == 4) {
                        //orta
                        this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
                        System.out.println("Tebrikler *Orta Zırh* kazandınız");
                    }else{
                        //hafif
                        this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
                        System.out.println("Tebrikler *Hafif Zırh* kazandınız");
                    }

                    break;
                case 2:
                case 3:
                case 4:
                    //Para kazanma ihtimali
                    //10 Para Kazanma İhtimali: 20%
                    //5 Para Kazanma İhtimali: 30%
                    //1 Para Kazanma İhtimali: 50%
                    int moneyChance = random.nextInt(9);
                    if (moneyChance == 0 || moneyChance == 1){
                        //10 para
                        System.out.println("Tebrikler *10 para* kazandınız.");
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);

                    } else if (moneyChance == 2 || moneyChance == 3 || moneyChance == 4) {
                        //5 para
                        System.out.println("Tebrikler *5 para* kazandınız.");
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);

                    }else {
                        //1 para
                        System.out.println("Tebrikler *1 para* kazandınız.");
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);

                    }
                    break;
            }



        }else{
            System.out.println("Malesef hiç bişey düşmedi...");
        }
    }

    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealt());
        System.out.println(this.obstacle.getName() + "canı " + this.getObstacle().getHealth());
    }
    public void playerStats(){
        System.out.println("-Oyuncu Değerleri-");
        System.out.println("--------------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealt());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int i ){
        System.out.println("-" + i + "." + this.getObstacle().getName() + " Değerleri-");
        System.out.println("--------------------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());

    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
