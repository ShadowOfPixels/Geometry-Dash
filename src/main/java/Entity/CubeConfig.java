package Entity;

import Handlers.KeyHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.Random;

public class CubeConfig {
    private static int cubeXCords = 200;
    private static int cubeYCords = 240;
    private Random randomInt = new Random();
    private KeyHandler handler;
    private boolean enterCount = true;
    private Image tempCube;
    private BufferedImage rotatingTempCube;
    Image jumpingBlock;





    public CubeConfig(KeyHandler handler) {
        this.handler = handler;
    }

    private void getCubeImages() {
        try {
              tempCube = new ImageIcon(getClass().getResource("/CubeIcons/GeometryDashCube.png")).getImage();
              jumpingBlock = new ImageIcon(getClass().getResource("/Textures/Jumping Block.png")).getImage();
        } catch (Exception e) {

        }

    }


    public void paint(Graphics g) {
        getCubeImages();
        g.drawImage(tempCube, cubeXCords, cubeYCords, 60, 60, null);
    }

    public void update() {
        if (enterCount) {
            if (handler.spacePressed) {
                cubeYCords = cubeYCords + 30;
                enterCount = false;
            }
        } else {
            cubeYCords = cubeYCords - 30;
            enterCount = true;
        }
    }
    public void rotate(){

    }
}
