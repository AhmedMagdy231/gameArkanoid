package Game.Windows;


import Game.Gameplay.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreBoardWindow extends JPanel {


        JButton BackButton = new JButton(new ImageIcon("src\\Data\\Images\\Menu\\back.png"));
        private int index_of_high_score;

        private int posY = 200;
        private ArrayList<Integer> all_Scores = new ArrayList<Integer>();
        private ArrayList<String> all_names = new ArrayList<String>();



        public ScoreBoardWindow(){
            setHighScores();
            BackButton.setBounds(625,10,140,40);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);



            g.setColor(Color.black);
            g.drawImage(new ImageIcon("src\\Data\\Images\\Backgrounds\\Score-Board.png").getImage(),0,0,800,600,this);


            this.add(BackButton);

            BackButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {

                    MainClass.getWindow().drawMenu();
                }

            });

            if(all_names.toArray().length > 0) {
                int TheHighestScore = Player.getHighScore();
                for (int i = 0; i < all_names.toArray().length; i++) {
                    if (all_Scores.get(i) == TheHighestScore) {
                        index_of_high_score = i;
                    }
                }


                g.setColor(Color.decode("#ffffff"));
                g.setFont(new Font("Arial", Font.PLAIN, 25));
                g.drawString("The Highest Score", 250, 25);
                g.drawString("   Name " + "    " + "Score", 250, 50);
                g.drawString("         " + all_names.get(index_of_high_score) + "        " + all_Scores.get(index_of_high_score), 200, 100);


                g.drawString("The Last 10 Scores", 250, 150);
                g.setColor(Color.decode("#ffffff"));
                g.setFont(new Font("Arial", Font.PLAIN, 25));
                g.drawString("   Name " + "    " + "Score", 250, 170);

                for (int i = all_names.toArray().length - 1; i > all_names.toArray().length - 11; i--) {

                    if (i >= 0) {
                        g.drawString("    " + all_names.get(i) + "    " + all_Scores.get(i), 250, posY);

                    } else {
                        g.drawString("--------------- \t --------------------", 250, posY + 10);
                    }

                    posY += 30;
                }
            }
        }

        private void setHighScores(){
            int counter  = 0;
            try{
                File myObj = new File("src\\Data\\Scores\\Scores.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.next();
                    counter++;
                    if (counter % 2 == 0){
                        int Score = Integer.parseInt(data);
                            all_Scores.add(Score);
                    }
                    else{
                            all_names.add(data);
                    }
                }
                myReader.close();
            }
            catch (IOException ex){
                System.out.println("Error File Not Founded");
            }


        }


}
