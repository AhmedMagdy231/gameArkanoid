package Game.Component;

import javax.swing.*;
import java.awt.*;

public class Ball {

    private int ballPosX;
    private int ballPosY;
    private int ballDirX;
    private int ballDirY;
    private int ballSizeX;
    private int ballSizeY;
    private final Image ballSprite = new ImageIcon("src\\Data\\Images\\Balls\\ball.png").getImage();
    private int ballRadius;


    public Ball(){

        ballPosX = Board.getPaddle().getPaddleX() + Board.getPaddle().getPaddleX()/4;
        ballPosY = Board.getPaddle().getPaddleY() - 15;
        ballDirX = 1;
        ballDirY = 2;
        ballSizeY =16;
        ballSizeX =16;
        ballRadius = ballSizeX /2;
    }

    //Methods of ballPosX
    public void setBallPosX(int ballPosX) {
        this.ballPosX = ballPosX;
    }

    public int getBallPosX() {
        return ballPosX;
    }


    //Methods of ballPosY
    public void setBallPosY(int ballPosY) {
        this.ballPosY = ballPosY;
    }

    public int getBallPosY() {
        return ballPosY;
    }


    //Methods of ballDirX
    public void setBallDirX(int ballDirX) {
        this.ballDirX = ballDirX;
    }

    public int getBallDirX() {
        return ballDirX;
    }


    //Methods of ballDirY
    public void setBallDirY(int ballDirY) {
        this.ballDirY = ballDirY;
    }
    public int getBallDirY() {
        return ballDirY;
    }

    //Methods of size
    public int getBallSizeX() {
        return ballSizeX;
    }

    public int getBallSizeY() {
        return ballSizeY;
    }

    public void ballGetBig()
    {
        ballSizeX =40;
        ballSizeY =40;
    }
    public void ballGetSmall()
    {
        ballSizeX =10;
        ballSizeY =10;
    }


    public void ballGetNormal()
    {
        ballSizeY =15;
        ballSizeX =15;
    }


    //ballImage
    public Image getBallSprite() {
        return ballSprite;
    }

//ball Radius
    public int getBallRadius() {
        return ballRadius;
    }

    //change Directions
    public void changeXDirection(){this.ballDirX*=-1;}
    public void changeYDirection(){this.ballDirY*=-1;}
}
