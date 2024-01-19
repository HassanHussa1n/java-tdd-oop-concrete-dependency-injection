package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply ps;
    ArrayList<Game> g;
    Game game1;


    public Computer(PowerSupply ps) {
       this.ps = ps;


    }

    public Computer(PowerSupply ps, ArrayList<Game> g) {

        this.ps = ps;
        this.g = g;

        installedGames.addAll(g);


    }

    public void turnOn() {
        ps.turnOn();
    }

    public void installGame(String game) {
        Game game2 = new Game(game);
        this.installedGames.add(game2);

    }

    public String playGame(String name) {

        for (Game g : this.installedGames) {
            if (g.name.equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
