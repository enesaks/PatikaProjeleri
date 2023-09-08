package Locations;

import Chracter.Bear;
import Chracter.Obstacle;
import Game.Player;

public class River extends BattleLocation{
    public River( Player player) {
        super(5, player, "Nehir", new Bear(), "water", "Ödül <Su>, dikkatli ol!! Ayı çıkabilir.",2);
    }
}
