package Game.Windows;


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;




public class Menu extends JPanel {

    JButton playB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\play.png"));
    JButton creditB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\Credits.png"));
    JButton high_scoresB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\High-Score.png"));
    JButton exitB = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\EXIT.png"));


    public Menu() {

        playB.setBounds(300, 240, 190, 55);
        creditB.setBounds(300, 320, 190, 55);
        high_scoresB.setBounds(250, 400, 300, 55);
        exitB.setBounds(300, 480, 190, 45);

        this.setLayout(null);
        this.revalidate();
        this.repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);



        g.drawImage(new ImageIcon("src\\Data\\Images\\Menu\\MainMenu-Background.png").getImage(), 0, 0, 800, 600, this);

        this.add(playB);
        this.add(creditB);
        this.add(high_scoresB);
        this.add(exitB);

        playB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainClass.getWindow().revalidate();

                MainClass.getWindow().drawGamePlay();

            }
        });

        high_scoresB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                MainClass.getWindow().drawScoreBoardWindow();

            }
        });


        creditB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                MainClass.getWindow().drawCreditWindow();
            }
        });


        exitB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }

        });


    }


}




