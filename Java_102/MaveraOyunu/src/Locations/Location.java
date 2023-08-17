package Locations;

import Game.Player;

import java.util.Scanner;

public abstract class Location {

    private Player player;
    private String name;
    private int id;
    private String info;

    public static Scanner scanner = new Scanner(System.in);


    public Location(int id,Player player, String name,String info) {
        this.id = id;
        this.player = player;
        this.name = name;
        this.info = info;
    }

    public abstract boolean onLocation();


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
