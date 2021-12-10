package Game.Package.Boss;

import Game.Component.Bricks;
import Game.Component.Enemies;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Boss extends Enemies {
    private  int hitCounter;
    private final Image bossSprite;
    private final int bossPosX;
    private boolean destroy;
    private BossWeapon bossWeapon;


    public Boss() {
        super();
        hitCounter = 25;
        bossSprite = new ImageIcon("src\\Data\\Images\\Boss.png").getImage();
        bossPosX = 135;
        destroy = false;
        bossWeapon = new BossWeapon(new Random().nextInt(400) , -1000 , new ImageIcon("src\\Data\\Images\\Laser_Shoot.png").getImage() , 5);


    }



    public int getHitCounter() {
        return this.hitCounter;
    }


    public Image getBossSprite() {
        return bossSprite;
    }

    public BossWeapon getBossWeapon() {
        return bossWeapon;
    }

    public int getBossPosX() {
        return bossPosX;
    }

    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }

    public boolean isDestroy() {
        return this.destroy;
    }

    public void setHitCounter(int hitCounter) {
        this.hitCounter = hitCounter;
    }





}
