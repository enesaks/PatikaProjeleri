package Locations;

import Chracter.Obstacle;
import Game.Player;

public  class BattleLocation extends Location{

    private Obstacle obstacle;
    private String award;



    public BattleLocation(int id, Player player, String name, Obstacle obstacle, String award, String info) {
        super(id, player, name, info);
        this.award = award;
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatlı Ol! Burada : " + this.getObstacle().getName() + " yaşıyor !!!");


        return true;
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


}
