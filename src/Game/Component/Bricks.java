package Game.Component;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Bricks{
    private final int brickPosX = 26;
    private final int brickPosY = 16;
    private int hitCounter;
    private boolean destroy;
    private Image brickImage;
    private int colorID;
    public Bricks(){}
    public Bricks(int colorID){
        this.colorID = colorID;
        destroy = false;
        switch (this.colorID) {
            case 1:
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Gray-brick.png").getImage();
                hitCounter = new Random().nextInt(6) + 1;
            break;
            case 2 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Red-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 3 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Yellow-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 4 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Blue-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 5 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Orange-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 6 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Green-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 7 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Cyan-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 8 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Rose-Brick.png").getImage();
                hitCounter = 1;
            break;
            case 9 :
                brickImage = new ImageIcon("src\\Data\\Images\\Bricks\\Indestructible-Brick.png").getImage();
                hitCounter = new Random().nextInt(6) + 1;
            break;
        }

    }

    public int getBrickPosX() {
        return brickPosX;
    }

    public int getBrickPosY() {
        return brickPosY;
    }

    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }

    public boolean isDestroy() {
        return destroy;
    }

    public void setHitCounter(int hitCounter) {
        this.hitCounter = hitCounter;
    }

    public int getHitCounter() {
        return hitCounter;
    }

    public Image getBrickImage() {
        return brickImage;
    }

    public int getColorID() {
        return colorID;
    }

}
