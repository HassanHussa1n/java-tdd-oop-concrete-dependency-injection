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


}
