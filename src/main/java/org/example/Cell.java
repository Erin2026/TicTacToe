package org.example;

import java.awt.*;

public class Cell {
    Color color;
    String form;

    public Cell(Color color,String form){
        this.color=color;
        this.form=form;
    }
    public void getColor(){
        System.out.print(this.color);
    }
}
