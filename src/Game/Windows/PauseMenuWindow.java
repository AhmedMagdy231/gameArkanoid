package Game.Windows;


import Game.Gameplay.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseMenuWindow extends JPanel {

    JButton BackB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\Resume.png"));
    JButton exitB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\EXIT.png"));

    public PauseMenuWindow(){
        BackB.setBounds(295,250,190,65);
        exitB.setBounds(295, 350, 190, 65);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);




        g.setColor(Color.black);
        g.fillRect(0,0,800,600);


        this.add(BackB);
        this.add(exitB);


        BackB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainClass.getWindow().drawGamePlay();
            }

        });

        exitB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            GamePlay.BasicState();
                MainClass.getWindow().drawMenu();

            }

        });

    }


}
