package Game.Windows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreditWindow extends JPanel {

    JButton BackButton = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\back.png"));

    public CreditWindow(){
        BackButton.setBounds(625,10,140,40);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);



        g.drawImage(new ImageIcon("src\\Data\\Images\\Backgrounds\\Credits-last-update.png").getImage(),0,0,800,570,this);
        this.add(BackButton);

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainClass.getWindow().drawMenu();
            }

        });

    }

}