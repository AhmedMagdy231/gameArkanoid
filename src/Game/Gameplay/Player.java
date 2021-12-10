package Game.Gameplay;

import java.io.*;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;
    private static int highScore;

    //FileWriter To Write Data
    FileWriter fw = null;

    public Player(String name){
        setHighScore();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    private static void setHighScore(){

        int counter  = 0;
        try{
            File myObj = new File("src\\Data\\Scores\\Scores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.next();
                counter++;
                if (counter % 2 == 0){
                    int Score = Integer.parseInt(data);
                    if(highScore < Score){
                        highScore = Score;
                    }
                 }
            }
            myReader.close();
        }
        catch (IOException ex){
            System.out.println("Error File Not Founded");
        }

    }

    public static int getHighScore() {
        setHighScore();
        return highScore;
    }

    public void saveScore(String name , String Score) {
        File Tempfile = new File("src\\Data\\Scores\\Temp.txt");
        try {
            fw = new FileWriter(Tempfile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        File myObj = new File("src\\Data\\Scores\\Scores.txt");
        Scanner myReader;
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                try {
                    String data = myReader.next();
                    fw.write(data);
                    fw.write('\n');

                } catch (IOException e) {
                    System.out.println("Not Founded");
                }
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Not Founded");
        }

        try {
            fw.write(name);
            fw.write('\n');
            fw.write(Score);
            fw.close();
            new File("src\\Data\\Scores\\Scores.txt").delete();
            Tempfile.renameTo(new File("src\\Data\\Scores\\Scores.txt"));
        }
        catch (IOException e) {
            System.out.println("Not Founded");
        }
        catch (NullPointerException e) {
            System.out.println("NULLS");
        }

    }

}

