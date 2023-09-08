package Locations;

import Chracter.Obstacle;
import Chracter.Vampire;
import Game.Player;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(4, player, "Orman", new Vampire(), "firewood", "Ödül <Odun>, dikkatli ol!! Vampir Çıkabilir.",3);
    }
}
