package net.pullolo.gamePanel;

import net.pullolo.handlers.userInput.KeyBoardHandler;
import net.pullolo.handlers.userInput.MouseHandler;

import javax.swing.*;
import java.awt.*;

public abstract class GamePanel extends JPanel implements Runnable{
    private Thread gameThread;
    private int maxFPS = 60;
    private int fps;
    public static final KeyBoardHandler keyBoardHandler = new KeyBoardHandler();
    public static final MouseHandler mouseHandler = new MouseHandler();

    GamePanel(Dimension d){
        setPreferredSize(d);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyBoardHandler);
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
        this.setFocusable(true);
    }

    @Override
    public void run() {

        double drawInterval = 1000000000/maxFPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null){

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            if (delta>=1){
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1000000000){
                fps = drawCount;
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    public abstract void update();
    public abstract void paintComponent(Graphics g);

    public int getMaxFPS() {
        return maxFPS;
    }
    public void setMaxFPS(int maxFPS) {
        this.maxFPS = maxFPS;
    }
    public int getFps() {
        return fps;
    }
}
