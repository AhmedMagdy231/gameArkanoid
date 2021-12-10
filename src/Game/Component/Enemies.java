package Game.Component;

import Game.Gameplay.Current_Time;

import javax.swing.*;
import java.awt.*;

public class Enemies  {

    private int EnemiesID;
    private int EnemiesVelX =1;
    private int EnemiesVelY =1;
    private static int EnemiesPosX =400;
    private static int EnemiesPosY =25;
    private Image EnemiesImage;
    private Current_Time EnemiesTimer = new Current_Time();
    private final EnemyWeapon enemyWeapon = new EnemyWeapon();


    public Enemies(){}
    public Enemies (int EnemiesID){
        this.EnemiesID =EnemiesID;
        switch (EnemiesID){
            case 1:
                EnemiesImage = new ImageIcon("src\\Data\\Images\\Enemy\\Red-3.png").getImage();
                break;
            case 2:
                EnemiesImage = new ImageIcon("src\\Data\\Images\\Enemy\\Blue-2.png").getImage();
                break;
        }
    }

    public void setEnemiesImage(int EnemiesID) {
        switch (EnemiesID){
            case 1:
                EnemiesImage = new ImageIcon("src\\Data\\Images\\Enemy\\Red-3.png").getImage();
                break;
            case 2:
                EnemiesImage = new ImageIcon("src\\Data\\Images\\Enemy\\Blue-2.png").getImage();
                break;
        }
    }

    public void setEnemiesPosX(int EnemiesPosX) {

        this.EnemiesPosX = EnemiesPosX;
    }
    public void setEnemiesPosY(int EnemiesPosY) {

        this.EnemiesPosY = EnemiesPosY;
    }

    public void setEnemiesVelX(int enemiesVelX) {

        this.EnemiesVelX = enemiesVelX;
    }

    public void setEnemiesVelY(int enemiesVelY) {

        this.EnemiesVelY = enemiesVelY;
    }
    public int EnemiesGetPosX() {

        return EnemiesPosX;
    }

    public int EnemiesGetPosY() {

        return EnemiesPosY;
    }

    public  int getEnemiesVelX() {

        return EnemiesVelX;
    }

    public int getEnemiesVelY() {
        return EnemiesVelY;

    }


    public Current_Time getEnemiesTimer() {

        return EnemiesTimer;
    }

    public Image getEnemiesImage() {

        return EnemiesImage;
    }

    public int getEnemiesID() {
        return EnemiesID;
    }

    public EnemyWeapon getEnemyWeapon() {
        return enemyWeapon;
    }

    public void setEnemiesID(int enemiesID) {
        this.EnemiesID = enemiesID;
    }

}

