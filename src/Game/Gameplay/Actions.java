package Game.Gameplay;

import Game.Component.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Actions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

            if (GamePlay.getNumberOfLevel() > 0 && GamePlay.getNumberOfLevel() <= 16) {

                int[][] Matrix2D = BricksPatternInLevels.getMatrix2D(GamePlay.getNumberOfLevel());
                Bricks[][] bricks = BricksPatternInLevels.getBricks();

                int brick_posX = 0;
                int brick_posY = 0;


                //  Rectangles Needed in collisions
                Rectangle brickRect;
                Rectangle ballRect = new Rectangle(Board.getBall().getBallPosX(), Board.getBall().getBallPosY(), Board.getBall().getBallSizeX(), Board.getBall().getBallSizeY());
                Rectangle boss_rect = new Rectangle(Board.getBoss().getBossPosX(), 50, 220, 300);
                Rectangle EnemiesRect = new Rectangle(Board.getEnemies().EnemiesGetPosX(), Board.getEnemies().EnemiesGetPosY(), 37, 36);


                if (GamePlay.isIsPlaying()) {
                    Board.getBall().setBallPosY(Board.getBall().getBallPosY() - Board.getBall().getBallDirY());
                    Board.getBall().setBallPosX(Board.getBall().getBallPosX() - Board.getBall().getBallDirX());

                    ////laser shoot movement
                    if (Board.getPaddle().getLaser().isPaddleGetLaser()) {
                        if (Board.getPaddle().getLaser().isKeyLaserPressed()) {
                            Board.getPaddle().getLaser().setShowLaser(true, 1);
                            Board.getPaddle().getLaser().laserMove();
                        }
                    }


                    //For Levels
                    if (GamePlay.getNumberOfLevel() < 16) {



                        //Enemies Motion
                        Board.getEnemies().setEnemiesPosX(Board.getEnemies().EnemiesGetPosX() + Board.getEnemies().getEnemiesVelX());
                        Board.getEnemies().setEnemiesPosY(Board.getEnemies().EnemiesGetPosY() + Board.getEnemies().getEnemiesVelY());

                        if (Board.getEnemies().getEnemiesID() == 1)
                            //BulletMotion
                            Board.getEnemies().getEnemyWeapon().setBulletsPosY(Board.getEnemies().getEnemyWeapon().getBulletsPosY() + Board.getEnemies().getEnemyWeapon().getBulletsVelY());
                    }
                    // set enemies to normal state
                    if (Board.getEnemies().getEnemiesTimer().getSecondTIME() > 30) {
                        int random = new Random().nextInt(10) + 1;
                        if (random == 1) {
                          Board.enemiesNormStat();
                        }
                    }
                    // getting power up
                    if (new Rectangle(GamePlay.getPower().getPowerPX(), GamePlay.getPower().getPowerPY(), 22, 11).intersects(new Rectangle(Board.getPaddle().getPaddleX(), Board.getPaddle().getPaddleY(), Board.getPaddle().getPaddleLong(), Board.getPaddle().getPaddleHeight()))) {
                        GamePlay.determinePowerUp();

                    }

                    // removing powerUp effect after a certain period of time
                    if (GamePlay.getPower().getTimer().getSecondTIME() > 10) {
                       Board.removePowerUp();
                    }


                    if (GamePlay.getNumberOfLevel() < 16) {
                        for (int i = 0; i < Matrix2D.length; i++) {
                            for (int j = 0; j < Matrix2D[0].length; j++) {

                                if (Matrix2D[i][j] >= 1) {
                                    switch (BricksPatternInLevels.getNumber_of_level()) {

                                        case 1:
                                        case 15:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j) + 15;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 14:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 1) + 15;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 7:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 3) + 10;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 8:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 1) + 68;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i) + 6;

                                            break;
                                        case 9:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 1) + 50;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 10:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 1) + 10;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 11:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j + 1) + 13;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 12:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j) + 16;
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);

                                            break;
                                        case 13:
                                            brick_posX = bricks[i][j].getBrickPosX() + 32 * (j);
                                            brick_posY = bricks[i][j].getBrickPosY() + 16 * (i + 4);
                                            break;

                                    }
                                    brickRect = new Rectangle(brick_posX, brick_posY, 32, 16);
                                    Rectangle shotRect = new Rectangle(GamePlay.getShotGun().getShootPosX(), GamePlay.getShotGun().getShootPosY(), GamePlay.getShotGun().getShootSizeX(), GamePlay.getShotGun().getShootSizeY());

                                    if (shotRect.intersects(brickRect)) {


                                        GamePlay.getShotGun().setShootPosY(-600);
                                        GamePlay.getShotGun().setShoot(false);
                                        GamePlay.getShotGun().Decrease_number_shoot();

                                        switch (bricks[i][j].getColorID()) {
                                            case 1:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + GamePlay.getNumberOfLevel() * 50);
                                                break;
                                            case 2:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 20);
                                                break;
                                            case 3:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 40);
                                                break;
                                            case 4:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 60);
                                                break;
                                            case 5:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 80);
                                                break;
                                            case 6:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 100);
                                                break;
                                            case 7:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 110);
                                                break;
                                            case 8:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 120);
                                                break;
                                            case 9:
                                                break;

                                        }
                                        if (bricks[i][j].getHitCounter() > 0) {
                                            bricks[i][j].setHitCounter(bricks[i][j].getHitCounter() - 1);
                                        }
                                        if (bricks[i][j].getHitCounter() == 0) {

                                            BricksPatternInLevels.set_Destroy_Matrix2D(Matrix2D, i, j, GamePlay.getNumberOfLevel());
                                            bricks[i][j].setDestroy(true);
                                        }
                                    }


                                    if (new Rectangle(Board.getBall().getBallPosX(), Board.getBall().getBallPosY(), Board.getBall().getBallSizeX(), Board.getBall().getBallSizeY()).intersects(brickRect)) {

                                        if (bricks[i][j].getColorID() < 9) {
                                            if (!GamePlay.getPower().getFall()) {
                                                //Get Power Up
                                                int Random_number = new Random().nextInt(20) + 1;
                                                int x;
                                                if (Random_number == 1) {
                                                    x = new Random().nextInt(7) + 1;
                                                    GamePlay.setPower(new PowerUPs(x));
                                                    GamePlay.getPower().setPowerPX(brickRect.x);
                                                    GamePlay.getPower().setPowerPY(ballRect.y);
                                                    GamePlay.getPower().setFall(true);
                                                }
                                            }
                                        }

                                        switch (bricks[i][j].getColorID()) {
                                            case 1:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + GamePlay.getNumberOfLevel() * 50);
                                                break;
                                            case 2:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 20);
                                                break;
                                            case 3:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 40);
                                                break;
                                            case 4:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 60);
                                                break;
                                            case 5:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 80);
                                                break;
                                            case 6:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 100);
                                                break;
                                            case 7:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 110);
                                                break;
                                            case 8:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 120);
                                                break;
                                            case 9:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + GamePlay.getNumberOfLevel() * 100);
                                                break;

                                        }

                                        if (bricks[i][j].getHitCounter() > 0) {
                                            bricks[i][j].setHitCounter(bricks[i][j].getHitCounter() - 1);
                                        }
                                        if (bricks[i][j].getHitCounter() == 0) {

                                            BricksPatternInLevels.set_Destroy_Matrix2D(Matrix2D, i, j, GamePlay.getNumberOfLevel());
                                            bricks[i][j].setDestroy(true);
                                        }

                                        if ((ballRect.x + Board.getBall().getBallRadius() >= brickRect.x) && (ballRect.x + Board.getBall().getBallRadius() <= brickRect.x + 32)) {
                                            Board.getBall().setBallDirY(-Board.getBall().getBallDirY());

                                        } else {
                                            Board.getBall().setBallDirX(-Board.getBall().getBallDirX());
                                        }

                                    }

                                    if (GamePlay.getPower().getFall() && GamePlay.getPower().getPowerPY() > 600) {
                                        GamePlay.getPower().setFall(false);
                                    }
                                    ////////// laser intersection/////////
                                    if (new Rectangle(Board.getPaddle().getLaser().getLaserPosX(), Board.getPaddle().getLaser().getLaserPosY(), 20, 50).intersects(brickRect)) {

                                        switch (bricks[i][j].getColorID()) {
                                            case 1:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + GamePlay.getNumberOfLevel() * 50);
                                                break;
                                            case 2:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 20);
                                                break;
                                            case 3:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 40);
                                                break;
                                            case 4:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 60);
                                                break;
                                            case 5:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 80);
                                                break;
                                            case 6:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 100);
                                                break;
                                            case 7:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 110);
                                                break;
                                            case 8:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + 120);
                                                break;
                                            case 9:
                                                Board.getPlayer().setScore(Board.getPlayer().getScore() + GamePlay.getNumberOfLevel() * 100);
                                                break;

                                        }
                                        BricksPatternInLevels.set_Destroy_Matrix2D(Matrix2D, i, j, GamePlay.getNumberOfLevel());
                                        bricks[i][j].setDestroy(true);
                                    }
                                }
                            }


                            //System.out.println(BricksPatternInLevels.getTotal_number_of_bricks(number_of_level));
                            if (BricksPatternInLevels.getTotal_number_of_bricks(GamePlay.getNumberOfLevel()) == 0) {
                                GamePlay.LevelUp();
                            }
                        }


                    }

                    //BOSS Level
                    else {

                        if (new Rectangle(Board.getBall().getBallPosX(), Board.getBall().getBallPosY(), Board.getBall().getBallSizeX(), Board.getBall().getBallSizeY()).intersects(new Rectangle(Board.getBoss().getBossPosX(), 50, 220, 300))) {
                            Board.getBoss().setHitCounter(Board.getBoss().getHitCounter() - 1);
                            if (Board.getBoss().getHitCounter() == 0) {
                                Board.getPlayer().setScore(Board.getPlayer().getScore() * 2);
                                Board.getBoss().setDestroy(true);
                                GamePlay.setFinishGame(true);
                            }

                            if (ballRect.x + Board.getBall().getBallRadius() > boss_rect.x && ballRect.x + Board.getBall().getBallRadius() < boss_rect.x + boss_rect.width) {
                                Board.getBall().setBallDirY(-Board.getBall().getBallDirY());

                            } else {
                                Board.getBall().setBallDirX(-Board.getBall().getBallDirX());
                            }
                        }

                        //boss laser weapon logic
                        if(Board.getBoss().getBossWeapon().getTime().getSecondTIME()>=4){
                            Board.getBoss().getBossWeapon().setShowLaser(true,2);

                        }
                        else if(Board.getBoss().getBossWeapon().getTime().getSecondTIME()<4){
                            Board.getBoss().getBossWeapon().setShowLaser(false,2);
                        }
                        //////
                        if(Board.getBoss().getBossWeapon().isShowLaser()){
                            if(Board.getBoss().getBossWeapon().getLaserPosY()>=Board.getPaddle().getPaddleY()){
                                if(new Rectangle(Board.getBoss().getBossWeapon().getLaserPosX(),Board.getBoss().getBossWeapon().getLaserPosY(),20,50).intersects(new Rectangle(Board.getPaddle().getPaddleX(),Board.getPaddle().getPaddleY(), Board.getPaddle().getPaddleLong(), Board.getPaddle().getPaddleHeight()))){
                                    Board.getPlayer().setScore(Board.getPlayer().getScore()-100);
                                    Board.getBoss().getBossWeapon().setLaserPosY(-1000);
                                    Board.getBoss().getBossWeapon().getTime().setSecondTIME(0);
                                }
                                else if(Board.getBoss().getBossWeapon().getLaserPosY()>=600) {
                                    Board.getBoss().getBossWeapon().getTime().setSecondTIME(0);


                                }
                            }
                        }


                    }






                    //top
                    if (Board.getBall().getBallPosY() <= 18) {
                        Board.getBall().changeYDirection();
                    }
                    //right
                    if (Board.getBall().getBallPosX() >= 465) {
                        Board.getBall().changeXDirection();
                    }
                    //left
                    if (Board.getBall().getBallPosX() <= 20) {
                        Board.getBall().changeXDirection();
                    }


                    //Enemies
                    if (Board.getEnemies().EnemiesGetPosY() <= 18) {
                        Board.getEnemies().setEnemiesVelY(-Board.getEnemies().getEnemiesVelY());
                    }

                    if (Board.getEnemies().EnemiesGetPosX() >= 465) {
                        Board.getEnemies().setEnemiesVelX(-Board.getEnemies().getEnemiesVelX());
                    }

                    if (Board.getEnemies().EnemiesGetPosX() <= 20) {
                        Board.getEnemies().setEnemiesVelX(-Board.getEnemies().getEnemiesVelX());
                    }

                    //bullets move
                    if (Board.getEnemies().getEnemyWeapon().getBulletsPosY() > 600) {
                        Board.getEnemies().getEnemyWeapon().setBulletsPosX(Board.getEnemies().EnemiesGetPosX());
                        Board.getEnemies().getEnemyWeapon().setBulletsPosY(Board.getEnemies().EnemiesGetPosY());

                    }
                    //enemies intersect with ball

                    Rectangle ball_rect = new Rectangle(Board.getBall().getBallPosX(), Board.getBall().getBallPosY(), Board.getBall().getBallSizeX(), Board.getBall().getBallSizeY());
                    if (EnemiesRect.intersects(ball_rect)) {
                        Board.getEnemies().setEnemiesPosX(1000);
                        Board.getEnemies().setEnemiesPosY(1000);


                    }
                    // Decrease Life Points till zero
                    if (Board.getBall().getBallPosY() > 600) {
                        GamePlay.BallFallen();
                    }

                    if (GamePlay.getShotGun().getShootPosY() < -1) {
                        if (GamePlay.getShotGun().getShoot())
                            GamePlay.getShotGun().Decrease_number_shoot();

                        GamePlay.getShotGun().setShoot(false);
                    }
                    if (Board.getEnemies().EnemiesGetPosY() > 600) {
                        Board.getPlayer().setScore(Board.getPlayer().getScore() - 20);
                        Board.getEnemies().setEnemiesPosX(400);
                        Board.getEnemies().setEnemiesPosY(25);
                    }

                    if (new Rectangle(Board.getPaddle().getPaddleX(), Board.getPaddle().getPaddleY(), Board.getPaddle().getPaddleLong(), Board.getPaddle().getPaddleHeight()).intersects(new Rectangle(Board.getEnemies().EnemiesGetPosX(), Board.getEnemies().EnemiesGetPosY(), 37, 44))) {
                        Board.getEnemies().setEnemiesPosX(-1000);
                        Board.getEnemies().setEnemiesPosY(-1000);
                    }
                    //enemies intersect with ball

                    if (EnemiesRect.intersects(new Rectangle(Board.getBall().getBallPosX(), Board.getBall().getBallPosY(), Board.getBall().getBallSizeX(), Board.getBall().getBallSizeY()))) {
                        Board.getEnemies().setEnemiesPosX(-1000);
                        Board.getEnemies().setEnemiesPosY(-1000);
                    }




                    //Ball intersection with paddle

                    Rectangle paddle_rec = new Rectangle(Board.getPaddle().getPaddleX(), Board.getPaddle().getPaddleY(), Board.getPaddle().getPaddleLong(), Board.getPaddle().getPaddleHeight());

                    //paddle intersect with enemy laser
                    if (new Rectangle(Board.getPaddle().getPaddleX(), Board.getPaddle().getPaddleY(), Board.getPaddle().getPaddleLong(), Board.getPaddle().getPaddleHeight()).intersects(new Rectangle(Board.getEnemies().getEnemyWeapon().getBulletsPosX(), Board.getEnemies().getEnemyWeapon().getBulletsPosY(), 20, 20))) {
                        Board.getPlayer().setScore(Board.getPlayer().getScore() - 50);
                        Board.getEnemies().getEnemyWeapon().setBulletsPosY(100000);
                    }

                    //paddle intersect with ball
                    if (paddle_rec.intersects(ball_rect)) {
                        if (ball_rect.x <= paddle_rec.x) {
                            if (Board.getBall().getBallDirX() < 0) {
                                Board.getBall().changeXDirection();
                                Board.getBall().changeYDirection();
                            } else if (Board.getBall().getBallDirX() > 0) {
                                Board.getBall().changeYDirection();
                            }

                        } else if (ball_rect.x >= paddle_rec.x + Board.getPaddle().getPaddleLong()) {
                            if (Board.getBall().getBallDirX() > 0) {
                                Board.getBall().changeXDirection();
                                Board.getBall().changeYDirection();
                            } else if (Board.getBall().getBallDirX() < 0) {
                                Board.getBall().changeYDirection();
                            }
                        } else {
                            Board.getBall().changeYDirection();
                        }
                    }
                }
            }
    }

}
