package Locations;

import Game.Player;

public class SafeHouse extends Location{
    public SafeHouse(Player player) {
        super(1,player, "Güvenli Ev","Burası sizin için güvenli bir ev, düşman yoktur.");
    }

    @Override
    public boolean onLocation() {
        return true;
    }

}
