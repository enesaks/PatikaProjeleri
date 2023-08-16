import java.awt.*;
import java.util.Scanner;

public class Game {

    private Player player;
    private Location location;
    private Scanner scanner = new Scanner(System.in);

    public void start(){




        System.out.println("Macera Oyununa Hoşgeldiniz !");

        System.out.println("İsminizi Giriniz : ");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        System.out.println("");

        player.selectCharacter();


        System.out.println("");







    }



}
