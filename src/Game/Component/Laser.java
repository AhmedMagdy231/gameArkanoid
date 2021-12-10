package Game.Component;

import javax.swing.*;
import java.awt.*;

public abstract class Laser {
    private int laserPosX;
    private int laserPosY;
    private int LaserVelocity=5;

    private Image laserImage;

    private boolean showLaser =false;

    public Laser(){}

    public Laser(int laserPosX, int laserPosY, Image laserImage, int laser_Velocity){
        this.laserImage = laserImage;
        this.laserPosX = laserPosX;
        this.laserPosY = laserPosY;
        this.LaserVelocity = laser_Velocity;
    }


    public Image getLaserImage() {
        return laserImage;
    }

    public void setLaserPosX(int laserPosX) {
        this.laserPosX = laserPosX;
    }

    public void setLaserPosY(int laserPosY) {
        this.laserPosY = laserPosY;
    }

    public int getLaserPosX() {
        return laserPosX;
    }

    public int getLaserPosY() {
        return laserPosY;
    }


    public int getLaserVelocity() {
        return LaserVelocity;
    }

    public abstract void laserMove();

    public void setShowLaser(boolean show_Laser, int laserID) {
        this.showLaser = show_Laser;
        switch (laserID){
            case 1:
                laserImage = new ImageIcon("src\\Data\\Images\\Laser1.png").getImage();
                break;
            case 2:
                laserImage = new ImageIcon("src\\Data\\Images\\Laser2.png").getImage();
                break;
        }
    }

    public boolean isShowLaser() {
        return showLaser;
    }

}

