package Locations;

import Game.Player;

import java.util.ArrayList;

public class SafeHouse extends Location{
    Player player;
    public SafeHouse(Player player) {
        super(1,player, "Güvenli Ev","Burası sizin için güvenli bir ev, düşman yoktur.");
        this.player = player;
    }

    @Override
    public boolean onLocation() {

        if(winContrl(player.getInventory().getAwardList())){
            System.out.println("Bütün ödülleri topladınız ve");
            System.out.println("Oyunu Başarıyla Bİtirdiniz...");
        }

        System.out.println("Güvenli evdesiniz.");
        System.out.println("Canınız Yenilendi.");
        this.getPlayer().setHealt(this.getPlayer().getOrjinalHealt());

        return true;
    }
    public boolean winContrl(ArrayList<String> awardList){
        int temp = 0;
        for (String award: awardList) {

            if( award.equals("water") || award.equals("firewood") ||award.equals("Food")){
                temp++;
            }
            if (temp == 3){
                return true;
            }
        }
        return false;
    }

}
