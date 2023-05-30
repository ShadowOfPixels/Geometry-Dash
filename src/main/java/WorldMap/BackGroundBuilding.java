package WorldMap;

import javax.swing.*;
import java.awt.*;

public class BackGroundBuilding {

    private Image backGround;

    public void MapBuilding(Graphics g){
        try {
            backGround = new ImageIcon(getClass().getResource("/BackGround/Geometry Background.png")).getImage();
            g.drawImage(backGround, 0, 0, 636, 420, null);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
