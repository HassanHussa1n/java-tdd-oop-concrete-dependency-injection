package com.booleanuk.core;

import java.util.ArrayList;

public class Game {
    PowerSupply ps;
    Computer comp;
    ArrayList<Game> installedGames;
    ArrayList<Game> game;
    String name;

    public Game(String name) {
        this.name = name;
    }
    public Game(Computer comp) {
        this.comp = comp;
    }

    public Game(PowerSupply ps, ArrayList<Game> games) {

        this.ps = ps;
        this.game = games;
        this.installedGames = new ArrayList<>();
        installedGames.addAll(game);
    }


    public String playGame(String name) {

        for (Game g : installedGames) {
            if (g.name.equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }

    public void installGame(String game) {
        if (installedGames == null) {
            installedGames = new ArrayList<>();
        }

        Game game2 = new Game(game);
        this.installedGames.add(game2);

    }



    public String start() {
        return "Playing " + this.name;
    }
}
