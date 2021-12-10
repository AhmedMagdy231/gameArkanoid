package Game.Component;
import javax.swing.*;
import java.awt.*;

public class ShotGun {
    private int shootPosX = 10000;
    private int ShootPosY;
    private boolean shoot=false;
    private boolean work = true;
    private int shootSizeX =20;
    private int shootSizeY =20;
    private  int numberShoot =5;
    private final Image shootSprite = new ImageIcon("src\\Data\\Images\\Shoot_Gun.png").getImage();

    public Image getShootSprite() {
        return shootSprite;
    }
    public void setShoot(boolean shoot) {
        this.shoot = shoot;
    }
    public boolean getShoot() {
        return shoot;
    }
    public boolean getWork() {
        return work;
    }
    public void setWork(boolean Work) {
        this.work = Work;
        numberShoot =0;
    }
    public int getNumberShoot() {
        return numberShoot;
    }
    public void setNumberShoot(int numberShoot) {
        this.numberShoot = numberShoot;
    }
    public void Decrease_number_shoot() {
        this.numberShoot--;
        if(numberShoot ==0) {
            work = false;
        }
    }
    public int getShootPosX() {
        return shootPosX;
    }
    public int getShootPosY() {
        return ShootPosY;
    }
    public void setShootPosX(int shootPosX) {
        this.shootPosX = shootPosX;
    }
    public void setShootPosY(int shootPosY) {
        this.ShootPosY = shootPosY;
    }
    public int getShootSizeX() {
        return shootSizeX;
    }
    public int getShootSizeY() {
        return shootSizeY;
    }
}
