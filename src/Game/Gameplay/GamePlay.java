package Game.Gameplay;

import Game.Component.Board;
import Game.Component.PowerUPs;
import Game.Component.ShotGun;
import Game.Windows.MainClass;
import Game.Windows.MainWindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class GamePlay extends JPanel  {


    //Actions
    private static Actions actions = new Actions();


    private static boolean isPlaying = false;
    private static int numberOfLevel = 6;
    private static boolean finishGame = false;
    private static PowerUPs power = new PowerUPs();
    private static Timer timer = new Timer(5,actions);
    private static ShotGun shotGun;
    JButton PauseB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\Pause.png"));




    public GamePlay() {

        PauseB.setBounds(700,500,40,40);
        shotGun =new ShotGun();

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);





        g.setColor(Color.black);
        g.fillRect(0,0,800,600);


        //HighScore
        g.setColor(Color.decode("#d4af37"));
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 25));
        g.drawString("HIGH SCORE", 520, 50);

        g.setColor(Color.decode("#d4af37"));
        g.setFont(new Font("Haettenschweiler", Font.PLAIN, 50));
        g.drawString(""+Player.getHighScore(), 565, 95);


        //Current Score
        g.setColor(Color.decode("#dc214e"));
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 25));
        g.drawString("SCORE", 520, 215);


        g.setColor(Color.decode("#d4af37"));
        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString("Shoot Gun : ", 520, 290);
        g.setColor(Color.decode("#f5f5f5"));
        g.drawString(""+ shotGun.getNumberShoot() ,670 ,290);

        g.setColor(Color.decode("#f5f5f5"));
        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString(""+Board.getPlayer().getScore() ,625 ,212);


        //timer
        timer.start();

        this.add(PauseB);


        PauseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                timer.stop();
                isPlaying = false;
                MainClass.getWindow().drawPause();
            }
        });


        //Draw Board
        Board.draw((Graphics2D) g  , this);

        //Draw Power Up
        if (power.getFall()) {
            g.drawImage(power.getPower_sprite(), power.getPowerPX(), power.getPowerPY(), 22, 11, this);
            power.setPowerPY(power.getPowerPY() + 1);
        }


        // Draw shotGun
        g.drawImage(shotGun.getShootSprite(), shotGun.getShootPosX(), shotGun.getShootPosY(), shotGun.getShootSizeX(), shotGun.getShootSizeY(),this);
        shotGun.setShootPosY(shotGun.getShootPosY()-1);
        //Draw Laser
        //draw laser with paddle
        if(Board.getPaddle().getLaser().isShowLaser()){
            g.drawImage(Board.getPaddle().getLaser().getLaserImage(), Board.getPaddle().getLaser().getLaserPosX(), Board.getPaddle().getLaser().getLaserPosY(), 20,50,this);
        }


        // draw Boss laser
        if(Board.getBoss().getBossWeapon().isShowLaser()){

            g.drawImage(Board.getBoss().getBossWeapon().getLaserImage(), Board.getBoss().getBossWeapon().getLaserPosX(), Board.getBoss().getBossWeapon().getLaserPosY(), 20, 50, this);
            Board.getBoss().getBossWeapon().laserMove();
        }
        else {
            Board.getBoss().getBossWeapon().setLaserPosY(0);
            Board.getBoss().getBossWeapon().setAngle(new Random().nextInt(350)+50);

        }


        // game over
        if(Board.getPaddle().getLifePoint() == 0){
            timer.stop();
            MainClass.getWindow().drawGameOver();
        }
        if(finishGame){
            MainClass.getWindow().drawYouWin();
        }
        // Game loop
        if(isIsPlaying()) {
            repaint();
        }
    }





    public static void setNumberOfLevel(int numberOfLevel) {
        GamePlay.numberOfLevel = numberOfLevel;
    }

    public static int getNumberOfLevel() {
        return numberOfLevel;
    }

    public static boolean isIsPlaying() {
        return isPlaying;
    }

    public static void setIsPlaying(boolean isPlaying) {
        GamePlay.isPlaying = isPlaying;
    }

    public static PowerUPs getPower() {
        return power;
    }

    public static void setPower(PowerUPs power) {
        GamePlay.power = power;
    }

    public static void setFinishGame(boolean finishGame) {
        GamePlay.finishGame = finishGame;
    }


    public static ShotGun getShotGun() {
        return shotGun;
    }

    // function of getting power up
    public static void determinePowerUp(){
        GamePlay.getPower().setPowerPY(900);
        GamePlay.getPower().getTimer().setSecondTIME(0);
        System.out.println(GamePlay.getPower().getTimer().getSecondTIME());
        // Long paddle power up

        if (GamePlay.getPower().getPowerID() == 1) {
            Board.getPaddle().powerUpLongPaddle();
        }
        //short paddle power up
        if (GamePlay.getPower().getPowerID() == 2) {
            Board.getPaddle().powerUpShortPaddle();
        }
        //big ball power up
        if (GamePlay.getPower().getPowerID() == 3) {
            Board.getBall().ballGetBig();
        }
        // paddle life points increase
        if (GamePlay.getPower().getPowerID() == 4) {
            Board.getPaddle().lifePointsInc();
        }
        // paddle gets shotgun
        if (GamePlay.getPower().getPowerID() == 5) {
            GamePlay.getShotGun().setWork(true);
            int Random_number = new Random().nextInt(5) + 1;
            GamePlay.getShotGun().setNumberShoot(Random_number);
            System.out.println("Total Number Of Shoot Is " + (Random_number + 5));
        }
        // small the ball power up
        if (GamePlay.getPower().getPowerID() == 6) {
            Board.getBall().ballGetSmall();
        }
        /////laser power up
        if (GamePlay.getPower().getPowerID() == 7) {
            Board.getPaddle().getLaser().setPaddleGetLaser(true);

        }
    }
  // set all to normal state
    public static  void BasicState () {
        MainWindow.setGamePlayActive(false);
        Board.getPaddle().setLifePoint(3);
        Board.getEnemies().setEnemiesPosX(400);
        Board.getEnemies().setEnemiesPosY(25);
        Board.getPaddle().getLaser().setPaddleGetLaser(false);
        Board.getPaddle().getLaser().setKeyLaserPressed(false);
        GamePlay.getShotGun().setWork(false);
        GamePlay.setIsPlaying(false);
        Board.getPaddle().setPaddleX(170);
        Board.getPaddle().setPaddleY(520);
        Board.getBall().setBallPosX(Board.getPaddle().getPaddleX() + Board.getPaddle().getPaddleX() / 4);
        Board.getBall().setBallPosY(Board.getPaddle().getPaddleY() - 15);
        Board.getPaddle().setPaddleLong(100);
        Board.getPaddle().paddleGetNormal();
        Board.getBall().ballGetNormal();
        Board.getEnemies().getEnemyWeapon().setBulletsPosX(Board.getEnemies().EnemiesGetPosX());
        Board.getEnemies().getEnemyWeapon().setBulletsPosY(Board.getEnemies().EnemiesGetPosY());
        GamePlay.getShotGun().setShootPosX(10000);
        GamePlay.getPower().setFall(false);
        GamePlay.getShotGun().setNumberShoot(5);
        BricksPatternInLevels.setBasicPatterns();
        GamePlay.setIsPlaying(false);
        GamePlay.setFinishGame(false);
        GamePlay.setNumberOfLevel(1);

    }


    public static void BallFallen(){
        Board.getPaddle().getLaser().setPaddleGetLaser(false);
        Board.getPaddle().getLaser().setKeyLaserPressed(false);
        GamePlay.getShotGun().setWork(false);
        GamePlay.setIsPlaying(false);
        GamePlay.getShotGun().setShootPosX(10000);
        Board.getPaddle().setPaddleX(170);
        Board.getPaddle().setPaddleY(520);
        Board.getBall().setBallPosX(Board.getPaddle().getPaddleX() + Board.getPaddle().getPaddleX() / 4);
        Board.getBall().setBallPosY(Board.getPaddle().getPaddleY() - 15);
        Board.getPaddle().setPaddleLong(100);
        Board.getPaddle().paddleGetNormal();
        Board.getBall().ballGetNormal();
        Board.getPaddle().lifePointDec();
    }

    public static void LevelUp(){
        GamePlay.setIsPlaying(false);
        Board.getPaddle().setPaddleX(170);
        Board.getPaddle().setPaddleY(520);
        Board.getBall().setBallPosX(Board.getPaddle().getPaddleX() + Board.getPaddle().getPaddleX() / 4);
        Board.getBall().setBallPosY(Board.getPaddle().getPaddleY() - 15);
        GamePlay.setNumberOfLevel(GamePlay.getNumberOfLevel() + 1);
    }
}
