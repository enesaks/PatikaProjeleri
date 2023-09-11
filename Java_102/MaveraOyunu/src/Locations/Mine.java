package Locations;

import Chracter.Obstacle;
import Chracter.Sneake;
import Game.Player;

public class Mine extends BattleLocation{
    public Mine(Player player) {
        super(6, player, "Maden",new Sneake(), " ", "buradan çeşitli itemler kazana bilirisin, dikkatli ol!! Yılan çıkabilir.", 5);
    }
}
