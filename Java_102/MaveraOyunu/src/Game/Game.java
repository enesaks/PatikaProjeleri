package Game;

import Locations.Location;
import Locations.SafeHouse;
import Locations.ToolStore;

import java.util.Scanner;

public class Game {

    private Player player;
    private Location location;
    private Scanner scanner = new Scanner(System.in);


    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz !");

        System.out.print("İsminizi Giriniz : ");
        String playerName = scanner.nextLine();
        player = new Player(playerName.toUpperCase());
        System.out.println("Merhaba "+player.getName() + " bu karanlık ve sisli adaya hoşgeldin!!!");

        System.out.println("-------------------------------------------------------------------");

        player.selectCharacter();

        System.out.println("-------------------------------------------------------------------");
        Location location = null;

        while (true){
            player.printInfo();

            System.out.println("\n########################### BOLGELER ###########################\n");

            Location[] locations = {new SafeHouse(player), new ToolStore(player)};
            for (Location loc: locations) {
                System.out.printf("%d- %10s  |  %s\n",loc.getId(),loc.getName(),loc.getInfo());
            }
            System.out.println("0 -- ÇIKIŞ YAP --");

            System.out.print("Gitmek İstediğiniz Bölgeyi Seçiniz : ");
            int select = scanner.nextInt();

            switch (select){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if (location == null){
                System.out.println("Çıkış Yapıldı.");
                break;
            }

            if (!location.onLocation()){
                System.out.println("**GAME OVER**");
                break;
            }

            System.out.println(location.getName());

        }






    }



}
