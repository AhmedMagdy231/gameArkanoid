package Game.Component;

import javax.swing.*;
import java.awt.*;

public class EnemyWeapon extends Laser{
    private int bulletsPosX =410;
    private int bulletsPosY =28;
    private final int bulletsVelY =3;


    private final Image WeaponImage = new ImageIcon("src\\Data\\Images\\Laser_Shoot.png").getImage();

    public Image getWeaponImage() {
        return WeaponImage;
    }

    public void setBulletsPosY(int posY) {

        this.bulletsPosY =posY;
    }

    public int getBulletsPosY() {

        return bulletsPosY;
    }

    public int getBulletsVelY() {

        return bulletsVelY;
    }



    public void setBulletsPosX(int bulletsPosX) {this.bulletsPosX = bulletsPosX;}
    public int getBulletsPosX() {
        return bulletsPosX;
    }

    @Override
    public void laserMove() {}
}
