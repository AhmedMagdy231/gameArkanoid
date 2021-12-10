package Game.Component;

import Game.Gameplay.BricksPatternInLevels;
import Game.Gameplay.GamePlay;
import Game.Gameplay.Player;
import Game.Package.Boss.Boss;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Board  {

    private static Player player = new Player("");
    private static Paddle paddle = new Paddle();
    private static Ball ball = new Ball();
    private static Enemies enemies = new Enemies(new Random().nextInt(2) + 1);
    private static Boss boss = new Boss();



    public static void draw (Graphics2D g , JPanel panel) {



        g.drawImage(new ImageIcon("src\\Data\\Images\\Backgrounds\\Blue.png").getImage(), 5, 12, 490, 600, panel);

        g.drawImage(new ImageIcon("src\\Data\\Images\\Board-Img.png").getImage(), 0, 0, 500, 600, panel);



        // draw Boss
        if(GamePlay.getNumberOfLevel()==16){
            if(boss.getHitCounter()>0) {
                g.drawImage(boss.getBossSprite(), boss.getBossPosX(), 50, 220, 300, panel);
            }
            }
        //Draw Pattern
        else {
            BricksPatternInLevels.determineLevel(GamePlay.getNumberOfLevel(),panel,g);
        }


        //Draw Paddle

        if (!paddle.getLaser().isPaddleGetLaser()){
            g.drawImage(paddle.getPaddleSprite(), paddle.getPaddleX(), paddle.getPaddleY(), paddle.getPaddleLong(), paddle.getPaddleHeight(), panel);}
        else if(paddle.getLaser().isPaddleGetLaser()){
            g.drawImage(paddle.getLaser().getPaddleLaserImg(), paddle.getPaddleX(), paddle.getPaddleY(), paddle.getPaddleLong(), paddle.getPaddleHeight(), panel);
        }
        //Draw Ball
        g.drawImage(ball.getBallSprite(), ball.getBallPosX(), ball.getBallPosY(), ball.getBallSizeX(), ball.getBallSizeY(), panel);


        //draw Sides
        g.drawImage(new ImageIcon("src\\Data\\Images\\side2.png").getImage(), 29, 3, 111, 18, panel);

        g.drawImage(new ImageIcon("src\\Data\\Images\\side2.png").getImage(), 360, 4, 110, 18, panel);

        if(GamePlay.getNumberOfLevel() <16)
        //draw Enemies
        // draw enemy&bullets
        if (enemies.getEnemiesTimer().getSecondTIME() <= 30) {
            if (enemies.getEnemiesID() == 1)
            {
                g.drawImage(enemies.getEnemyWeapon().getWeaponImage(), enemies.getEnemyWeapon().getBulletsPosX(), enemies.getEnemyWeapon().getBulletsPosY(), 20, 20, panel);
            }

            g.drawImage(enemies.getEnemiesImage(), enemies.EnemiesGetPosX(), enemies.EnemiesGetPosY(), 37, 44, panel);
        }



        //LifePoints
        g.setColor(Color.decode("#1cf4a2"));
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 25));
        g.drawString("LIFE POINTS", 520, 340);
        for (int i = 0; i < paddle.getLifePoint(); i++) {
            g.drawImage(paddle.getPaddleSprite(), 490 + (i + 1) * 30, 350, 30, 7, panel);
        }


    }

    public static Paddle getPaddle() {
        return paddle;
    }

    public static Ball getBall() {
        return ball;
    }

    public static Player getPlayer() {
        return player;
    }
    // enemy's functions
    public static Enemies getEnemies() {
        return enemies;
    }

    public static void enemiesNormStat(){
      int random_number_of_enemy = new Random().nextInt(2) + 1;
      Board.getEnemies().setEnemiesID(random_number_of_enemy);
      Board.getEnemies().setEnemiesImage(random_number_of_enemy);
      Board.getEnemies().setEnemiesPosX(400);
      Board.getEnemies().setEnemiesPosY(25);
      Board.getEnemies().getEnemyWeapon().setBulletsPosX(415);
      Board.getEnemies().getEnemyWeapon().setBulletsPosY(28);
      Board.getEnemies().getEnemiesTimer().setSecondTIME(0);

  }
    // remove power
    public static void removePowerUp(){
    Board.getBall().ballGetNormal();
    Board.getPaddle().paddleGetNormal();
    Board.getPaddle().getLaser().setShowLaser(false, 1);
    Board.getPaddle().getLaser().setKeyLaserPressed(false);
    Board.getPaddle().getLaser().setPaddleGetLaser(false);
}


    public static Boss getBoss() {
        return boss;
    }


}
