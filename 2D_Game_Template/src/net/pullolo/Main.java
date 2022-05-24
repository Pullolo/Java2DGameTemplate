package net.pullolo;

import net.pullolo.gamePanel.Game;
import javax.swing.*;

public class Main {
    //Todo, go to Game class to start writing your game!
    public static void main(String[] args) {
        load();
    }

    public static void load(){
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game panel = new Game();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        panel.startGameThread();
    }
}
