package org.example;

import java.awt.*;

public class Player {
    Enum instancePlayer;
    String name;
    Color color ;

    public Player(Enum instance, String name,Color color){
        this.instancePlayer = instance;
        this.name = name;
        this.color=color;
    }

    public void place(Coordinates coordinates){
    }
}
