package Game.Package.Boss;

import Game.Component.Laser;
import Game.Gameplay.Current_Time;

import java.awt.*;

public class BossWeapon extends Laser {

    private Current_Time time = new Current_Time();
    private int angle ;


    public BossWeapon(int x , int y , Image laser_img , int velocity){
        super(x,y,laser_img,velocity);
        angle=x;
    }


    public Current_Time getTime() {
        return time;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }


    @Override
    public int getLaserPosY() {
        return super.getLaserPosY();
    }

    @Override
    public int getLaserPosX() {
        return super.getLaserPosX();
    }

    @Override
    public int getLaserVelocity() {
        return super.getLaserVelocity();
    }

    @Override
    public Image getLaserImage() {
        return super.getLaserImage();
    }

    @Override
    public void laserMove() {
        this.setLaserPosY(getLaserPosY() + getLaserVelocity());

        this.setLaserPosX(angle + getLaserVelocity());
    }



}
