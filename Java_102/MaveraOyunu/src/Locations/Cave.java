package Locations;

import Chracter.Obstacle;
import Chracter.Zombie;
import Game.Player;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(3, player, "Mağra", new Zombie(), "Food", "Ödül <Yemek>, dikkatli ol!! Zombi çıkabilir.",3);
    }
}
