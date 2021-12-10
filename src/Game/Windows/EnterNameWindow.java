package Game.Windows;



import Game.Component.Board;
import Game.Gameplay.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterNameWindow extends JPanel {


    JTextField textName = new JTextField("Enter Your Name");
    JButton EnterButton = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\Enter.png"));
    private boolean valid_name = false;
    public EnterNameWindow(){
        textName.setBounds(280,300,200,20);
        EnterButton.setBounds(280,360,200,65);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);

        this.add(textName);
        this.add(EnterButton);

        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("Please Make Sure Your Name dosen't Have Spaces or Special Characters", 150, 480);


        draw();

    }

    private boolean checkNameValidation(String name){
        for(int i = 0 ; i< name.length();i++){
            if(name.charAt(i) == ' ' || name.charAt(i) == '$' || name.charAt(i) == '!' || name.charAt(i)=='@' || name.charAt(i) == '~'){
                return false;
            }
        }
        return true;
    }

   private void draw(){
       EnterButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println(textName.getText());

               valid_name = checkNameValidation(textName.getText());

               if(valid_name) {
                   valid_name = false;
                   Board.getPlayer().setName(textName.getText());
                   Board.getPlayer().saveScore(Board.getPlayer().getName(), String.valueOf(Board.getPlayer().getScore()));


                   MainClass.getWindow().drawMenu();
                   GamePlay.BasicState();
               }
               else{
                   MainClass.getWindow().drawEnterName();
               }
           }
       });
   }
}
