package Game.Component;

import javax.swing.*;
import java.awt.*;

public  class Paddle {
    //Variables for paddle
    private int PaddleX;
    private int PaddleY;
    private int paddleLong;
    private final int paddleHeight;
    private int lifePoint;

    //Power Ups Boolean
    private boolean paddleGetLong;
    private boolean paddleGetShort;

    private final LaserWeapon laser = new LaserWeapon();

    //Paddle Image
    private Image paddleSprite = new ImageIcon("src\\Data\\Images\\Paddles\\Blue_paddle.png").getImage();
    //Paddle with laser power up image


    public Paddle()
    {
        PaddleX = 170;
        PaddleY = 520;
        paddleLong = 100;
        paddleHeight = 22;
        lifePoint = 3;

    }

    //Methods of PaddleX
    public void setPaddleX(int PaddleX) {
        this.PaddleX = PaddleX;
    }
    public int getPaddleX() {
        return PaddleX;
    }


    //Methods of PaddleY
    public void setPaddleY(int PaddleY) {
        this.PaddleY = PaddleY;
    }

    public int getPaddleY() {
        return PaddleY;
    }




    // function that long the paddle

    public void setPaddleLong(int paddleLong) {
        this.paddleLong = paddleLong;
    }

    public boolean isPaddleGetLong() {
        return paddleGetLong;
    }


    public void paddleGetNormal()
    {
        paddleLong = 100;
        paddleGetLong = false;
        paddleGetShort=false;
        paddleSprite = new ImageIcon("src\\Data\\Images\\Paddles\\Blue_paddle.png").getImage();

    }

    public void powerUpLongPaddle(){
        paddleLong = 150;
        paddleGetLong = true;

    }

    // function that short the paddle

    public void powerUpShortPaddle(){
        paddleLong = 50;
        paddleGetShort=true;

    }

    public boolean isPaddleGetShort() {
        return paddleGetShort;
    }

    public int getPaddleLong() {
        return paddleLong;
    }



    public void lifePointsInc(){
        lifePoint++;
    }

    public void lifePointDec(){
        lifePoint--;

    }


    public void moveRight(){
        PaddleX+=20;
    }

    public void moveLeft(){
        PaddleX-=20;
    }


    public Image getPaddleSprite() {
        return paddleSprite;
    }



    public int getPaddleHeight() {
        return paddleHeight;
    }


    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public LaserWeapon getLaser() {
        return laser;
    }
}

