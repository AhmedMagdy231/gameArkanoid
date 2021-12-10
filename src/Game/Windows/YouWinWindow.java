package Game.Windows;

import Game.Component.Board;
import Game.Gameplay.BricksPatternInLevels;
import Game.Gameplay.Current_Time;
import Game.Gameplay.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YouWinWindow extends JPanel implements ActionListener {


    Current_Time timer = new Current_Time();

    public YouWinWindow(){
        timer.setSecondTIME(0);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.white);
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 50));
        g.drawString("You Win", 250, 300);
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arkanoid Solid", Font.PLAIN, 35));
        g.drawString("Your HighScore", 240, 350);

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString(String.valueOf(Board.getPlayer().getScore()), 350, 390);


        if(timer.getSecondTIME() > 3){

            MainClass.getWindow().drawEnterName();

        }
        repaint();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
