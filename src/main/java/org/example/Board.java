package org.example;

import java.awt.*;

public class Board {

    Cell[][] cells = new Cell[3][3];
    PrintManager printManager;
    public void print(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                if (cells[i][j].color!=null){
                    printManager.printColor(cells[i][j].color,cells[i][j].form);
                }
            }
        }
    }

    public void setCellColor(Coordinates coord, Color color){
        cells[coord.absciss][coord.ordinate].color=color;
    }
}

