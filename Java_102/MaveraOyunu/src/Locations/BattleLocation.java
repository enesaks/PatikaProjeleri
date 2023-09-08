package Locations;

import Chracter.Obstacle;
import Game.Player;

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

        for (int i = 1; i <= obsNumber; i++ ){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());

            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealt() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<V>ur veya <K>aç : ");
                String selectCase = scanner.nextLine().toUpperCase();
                if (selectCase.equals("V")){
                    System.out.println("Siz Vurdunuz ! ");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getObstacle().getHealth() > 0){
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
                System.out.println(this.getObstacle().getAward() + " para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
            }

        }
        return false;
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
