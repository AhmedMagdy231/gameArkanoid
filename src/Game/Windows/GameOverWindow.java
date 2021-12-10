package Game.Windows;

import Game.Component.Board;
import Game.Gameplay.Current_Time;

import javax.swing.*;
import java.awt.*;


public class GameOverWindow extends JPanel {

    Current_Time timer = new Current_Time();

    public GameOverWindow(){
        timer.setSecondTIME(0);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.white);
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 50));
        g.drawString("Game OVER", 200, 300);
        g.setColor(Color.red);
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 35));
        g.drawString("Your Score", 240, 350);

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString(String.valueOf(Board.getPlayer().getScore()), 350, 390);


        if(timer.getSecondTIME() > 3){

            MainClass.getWindow().drawEnterName();


        }
        repaint();
    }

}
