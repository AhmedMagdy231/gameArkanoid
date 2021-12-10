package Game.Gameplay;

import Game.Component.Board;
import Game.Windows.MainClass;
import Game.Windows.MainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {


    @Override
    public void keyPressed(KeyEvent e) {

        if(MainWindow.isGamePlayActive()) {
            // this key shots the shotgun
            if (e.getKeyCode() == KeyEvent.VK_A) {
                if(GamePlay.isIsPlaying()) {
                    if (!GamePlay.getShotGun().getShoot() && GamePlay.getShotGun().getWork() && GamePlay.getShotGun().getNumberShoot() > 0) {
                        GamePlay.getShotGun().setShootPosX(Board.getPaddle().getPaddleX() + Board.getPaddle().getPaddleLong() / 2);
                        GamePlay.getShotGun().setShootPosY(Board.getPaddle().getPaddleY());
                        GamePlay.getShotGun().setShoot(true);
                    }
                }

            }

            // this key moves the paddle to right
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (!GamePlay.isIsPlaying()) {
                    if (Board.getPaddle().getPaddleX() >= 370) {
                        Board.getPaddle().setPaddleX(370);
                    } else {
                        Board.getPaddle().moveRight();
                        Board.getBall().setBallPosX(Board.getBall().getBallPosX() + 20);

                    }
                }

                if (GamePlay.isIsPlaying()) {
                    if (Board.getPaddle().getPaddleX() >= 370) {
                        Board.getPaddle().setPaddleX(370);
                    } else {
                        Board.getPaddle().moveRight();
                    }
                    if (Board.getPaddle().isPaddleGetLong()) {
                        if (Board.getPaddle().getPaddleX() >= 320) {
                            Board.getPaddle().setPaddleX(320);
                        } else {
                            Board.getPaddle().moveRight();
                        }
                    }
                    if (Board.getPaddle().isPaddleGetShort()) {
                        if (Board.getPaddle().getPaddleX() >= 370) {
                            Board.getPaddle().setPaddleX(370);
                        } else {
                            Board.getPaddle().moveRight();
                        }
                    }
                }

                MainClass.getWindow().repaint();
            }
            // this key moves the paddle to left
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (!GamePlay.isIsPlaying()) {
                    if (Board.getPaddle().getPaddleX() <= 25) {
                        Board.getPaddle().setPaddleX(25);

                    } else {
                        Board.getPaddle().moveLeft();
                        Board.getBall().setBallPosX(Board.getBall().getBallPosX() - 20);

                    }
                }
                if (GamePlay.isIsPlaying()) {
                    if (Board.getPaddle().getPaddleX() <= 25) {
                        Board.getPaddle().setPaddleX(25);

                    } else {
                        Board.getPaddle().moveLeft();
                    }
                }

                MainClass.getWindow().repaint();
            }
            // this key starts the game
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                if (Board.getPaddle().getLifePoint() > 0) {
                    if (!GamePlay.isIsPlaying()) {
                        System.out.println(0);
                        GamePlay.setIsPlaying(true);
                    }

                    MainClass.getWindow().repaint();
                }

            }
            // this key shots the laser
            if (e.getKeyCode() == KeyEvent.VK_Z) {
                if (GamePlay.isIsPlaying()) {
                    /////////// laser movement
                    if (Board.getPaddle().getLaser().isPaddleGetLaser()) {
                        if (!Board.getPaddle().getLaser().isKeyLaserPressed()) {
                            Board.getPaddle().getLaser().setKeyLaserPressed(true);

                            Board.getPaddle().getLaser().setLaserPosY(Board.getPaddle().getPaddleY());
                            Board.getPaddle().getLaser().setLaserPosX(Board.getPaddle().getPaddleX() + 50);
                        }
                    }
                }
                MainClass.getWindow().repaint();
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}



}
