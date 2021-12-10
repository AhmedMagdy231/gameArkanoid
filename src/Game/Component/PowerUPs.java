package Game.Component;

import Game.Gameplay.Current_Time;

import javax.swing.*;
import java.awt.*;

public class PowerUPs {
    private int powerPX;
    private int powerPY;
    private int PowerID;
    private boolean fall;
    private Image power_sprite;
    private Current_Time timer = new Current_Time();

    public PowerUPs(){}
    public  PowerUPs(int PowerID)
    {
        this.PowerID = PowerID;

        switch (this.PowerID){
            case 1 :
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Long-Paddel-PowerUp.png").getImage();
                break;
            case 2:
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Short-Paddle-PowerUp.png").getImage();
                break;
            case 3:
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Ball-Big-PowerUp.png").getImage();
                break;
            case 4:
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Life-Points-Increase.png").getImage();
                break;
            case 5:
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Pistole-PowerUp.png").getImage();
                break;
            case 6:
                power_sprite = new ImageIcon("src\\Data\\Images\\PowerUps\\Small-Ball-PoweUp.png").getImage();
                break;
            case 7:
                power_sprite=new ImageIcon("src\\Data\\Images\\PowerUps\\Laser_Power_Up.png").getImage();
                break;
        }
        fall=false;
    }



    public void setPowerPX(int powerPX) {
        this.powerPX = powerPX;
    }


    public void setFall(boolean fall) {
        this.fall = fall;
    }

    public void setPowerPY(int powerPY) {
        this.powerPY = powerPY;
    }

    public Image getPower_sprite() {
        return power_sprite;
    }

    public int getPowerID() {
        return PowerID;
    }

    public int getPowerPX() {
        return powerPX;
    }

    public int getPowerPY() {
        return powerPY;
    }

    public boolean getFall()
    {
        return fall;
    }


    public Current_Time getTimer() {
        return timer;
    }
}
