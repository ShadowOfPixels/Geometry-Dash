package core;

import Entity.CubeConfig;
import Handlers.KeyHandler;
import WorldMap.BackGroundBuilding;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class Engine extends JPanel implements Runnable {

    public KeyHandler handler = new KeyHandler();
    private CubeConfig cubeConfig = new CubeConfig(handler);
    private Random randomInt = new Random();
    private static final int FPS = 10;
    protected boolean isRunning = false;
    private BackGroundBuilding worldMap= new BackGroundBuilding();

    public Engine(){
        this.addKeyListener(handler);
        this.setFocusable(true);
    }
    public void start() {
        isRunning = true;
    }

    public void run() {

        while (isRunning) {
            long currentTime = System.nanoTime();
            long estimatedFinishTime = 1000000000 / FPS;

            //DO STUFF
            update();
            repaint();

            long updateTime = System.nanoTime() - currentTime;
            long wait = (estimatedFinishTime - updateTime) / 1000000;

            try {
                Thread.sleep(wait);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void update() {
        cubeConfig.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        worldMap.MapBuilding(g);
        cubeConfig.paint(g);

        g.dispose();
    }
}
