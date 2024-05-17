package org.example;

import java.awt.*;

public class PrintManager {
    public void printColor(Color color, String text) {
        if (color == Color.green) {
            System.out.print("\u001B[32m" + text + "\u001B[0m");
        }
        if (color == Color.red) {
            System.out.print("\u001B[31m" + text + "\u001B[0m");
        }
        if (color == Color.blue) {
            System.out.print("\u001B[34m" + text + "\u001B[0m");
        }
    }
}
