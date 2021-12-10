package Game.Component;

import javax.swing.*;
import java.awt.*;

public class LaserWeapon extends Laser{
    private final Image paddleLaserImg =new ImageIcon("src\\Data\\Images\\Laser_Power_UP.png").getImage();
    private boolean paddleGetLaser =false;
    private boolean keyLaserPressed=false;

    public void setPaddleGetLaser(boolean paddleGetLaser) {
        this.paddleGetLaser = paddleGetLaser;
    }

    public void setKeyLaserPressed(boolean keyLaserPressed) {
        this.keyLaserPressed = keyLaserPressed;
    }

    public boolean isKeyLaserPressed() {
        return keyLaserPressed;
    }
    public Image getPaddleLaserImg() {
        return paddleLaserImg;
    }

    public boolean isPaddleGetLaser() {
        return paddleGetLaser;
    }
    @Override
    public void laserMove() {
        if(paddleGetLaser) {
            this.setLaserPosY(getLaserPosY() - getLaserVelocity());
            if (this.getLaserPosY() <= 15) {
                this.setLaserPosY(-10000);
                this.setPaddleGetLaser(false);
                this.setKeyLaserPressed(false);
            }
        }
    }

    @Override
    public void setLaserPosY(int laserPosY) {
        super.setLaserPosY(laserPosY);
    }
}
