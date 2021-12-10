package Game.Windows;

import Game.Gameplay.GamePlay;
import Game.Gameplay.Keys;

import javax.swing.*;



public class MainWindow extends JPanel  {



    private static boolean gamePlayActive = false;



    public MainWindow() {
        addKeyListener(new Keys());
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);

    }

    public void drawGamePlay(){
        gamePlayActive = true;

        this.removeAll();
        this.revalidate();
        this.add(new GamePlay());

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }

    public void drawScoreBoardWindow(){
        this.removeAll();
        this.revalidate();
        this.add(new ScoreBoardWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawCreditWindow(){
        this.removeAll();
        this.revalidate();
        this.add(new CreditWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawGameOver(){
        this.removeAll();
        this.revalidate();
        this.add(new GameOverWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawYouWin(){
        this.removeAll();
        this.revalidate();
        this.add(new YouWinWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawMenu(){

        this.removeAll();
        this.revalidate();
        this.add(new Menu());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawPause(){
        this.removeAll();
        this.revalidate();
        this.add(new PauseMenuWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void drawEnterName(){
        this.removeAll();
        this.revalidate();
        this.add(new EnterNameWindow());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }



    public static void setGamePlayActive(boolean gamePlayActive) {
        MainWindow.gamePlayActive = gamePlayActive;
    }

    public static boolean isGamePlayActive() {
        return gamePlayActive;
    }



}

