package Game.Gameplay;
import Game.Component.Bricks;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BricksPatternInLevels {

    private static  int total_number_of_bricks_level1 = 8 * 13 ;
    private    static  int total_number_of_bricks_level2 = 66;
    private static  int total_number_of_bricks_level3 = 88;
    private static  int total_number_of_bricks_level4 = 114;
    private static  int total_number_of_bricks_level5 = 70 ;
    private static  int total_number_of_bricks_level6 = 79;
    private static  int total_number_of_bricks_level7 = 68;
    private static  int total_number_of_bricks_level8 = 50;
    private static  int total_number_of_bricks_level9 = 49;
    private static  int total_number_of_bricks_level10 =66;
    private  static  int total_number_of_bricks_level11 =85;
    private static  int total_number_of_bricks_level12 =81;
    private static  int total_number_of_bricks_level13 =140;
    private static  int total_number_of_bricks_level14 =132;
    private static  int total_number_of_bricks_level15 =93;



    private static int number_of_level;

    private static int[][] level1Matrix ={
            {1,1,1,1,1,1,1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2,2,2,2,2,2},
            {3,3,3,3,3,3,3,3,3,3,3,3,3},
            {4,4,4,4,4,4,4,4,4,4,4,4,4},
            {5,5,5,5,5,5,5,5,5,5,5,5,5},
            {6,6,6,6,6,6,6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7,7,7,7,7,7,7},
            {8,8,8,8,8,8,8,8,8,8,8,8,8}
    };

    private static int[][] level2Matrix = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {8, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0},
            {8, 7, 6, 4, 0, 0, 0, 0, 0, 0, 0},
            {8, 7, 6, 4, 2, 0, 0, 0, 0, 0, 0},
            {8, 7, 6, 4, 2, 6, 0, 0, 0, 0, 0},
            {8, 7, 6, 4, 2, 6, 8, 0, 0, 0, 0},
            {8, 7, 6, 4, 2, 6, 8, 7, 0, 0, 0},
            {8, 7, 6, 4, 2, 6, 8, 7, 6, 0, 0},
            {8, 7, 6, 4, 2, 6, 8, 7, 6, 4, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8}
    };

    private static int[][] level3Matrix = {
            {6,6,6,6,6,6,6,6,6,6,6},
            {0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,9,9,9,9,9,9,9,9},
            {0,0,0,0,0,0,0,0,0,0,0},
            {2,2,2,2,2,2,2,2,2,2,2},
            {0,0,0,0,0,0,0,0,0,0,0},
            {9,9,9,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0},
            {8,8,8,8,8,8,8,8,8,8,8},
            {0,0,0,0,0,0,0,0,0,0,0},
            {4,4,4,9,9,9,9,9,9,9,9},
            {0,0,0,0,0,0,0,0,0,0,0},
            {4,4,4,4,4,4,4,4,4,4,4},
            {0,0,0,0,0,0,0,0,0,0,0},
            {9,9,9,4,4,4,4,4,4,4,4}
    };

    private static int [][] level4Matrix = {
            {0,2,2,2,2,0,3,3,3,3,0},
            {0,5,5,5,5,0,4,4,4,4,0},
            {0,7,7,7,7,0,5,5,5,5,0},
            {0,2,2,2,2,0,6,6,6,6,0},
            {0,1,1,1,1,0,1,1,1,1,0},
            {0,4,4,4,4,0,8,8,8,8,0},
            {0,6,6,6,6,0,2,2,2,2,0},
            {0,7,7,7,7,0,3,3,3,3,0},
            {0,4,4,4,4,0,5,5,5,5,0},
            {0,1,1,1,1,0,1,1,1,1,0},
            {0,2,2,2,2,0,2,2,2,2,0},
            {0,4,4,4,4,0,3,3,3,3,0},
            {0,5,5,5,5,0,6,6,6,6,0},
            {0,8,8,8,8,0,7,7,7,7,0}
    };

    private static int[][] level5Matrix = {
            {0,0,0,5,0,0,0,5,0,0,0},
            {0,0,0,0,5,0,5,0,0,0,0},
            {0,0,0,0,5,0,5,0,0,0,0},
            {0,0,0,1,1,1,1,1,0,0,0},
            {0,0,0,1,1,1,1,1,0,0,0},
            {0,0,1,1,2,1,2,1,1,0,0},
            {0,0,1,1,2,1,2,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,0},
            {1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,0,0,0,0,1,0,1},
            {1,0,1,0,0,0,0,0,1,0,1},
            {1,0,1,1,0,0,0,1,1,0,1},
            {0,0,0,0,1,0,1,0,0,0,0},
            {0,0,0,0,1,0,1,0,0,0,0}
    };

    private static int[][] level6Matrix = {
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,1,1,1,1,1,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1}
    };

    private static int[][] level7Matrix = {
            {0,0,1,1,1,0,0},
            {0,1,2,2,2,1,0},
            {0,1,3,3,3,1,0},
            {1,4,4,4,4,4,1},
            {1,5,5,5,5,5,1},
            {1,4,4,4,4,4,1},
            {1,6,6,6,6,6,1},
            {1,7,7,7,7,7,1},
            {1,8,8,8,8,8,1},
            {0,1,2,2,2,1,0},
            {0,1,4,4,4,1,0},
            {0,0,1,1,1,0,0}
    };

    private static int[][] level8Matrix = {
            {9,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,4,0,0,0,0,0},
            {9,0,0,0,4,7,4,0,0,0,0},
            {9,0,0,4,7,4,7,4,0,0,0},
            {9,0,4,7,4,1,4,7,4,0,0},
            {9,0,0,4,7,4,7,4,0,0,0},
            {9,0,0,0,4,7,4,0,0,0,0},
            {9,0,0,0,0,4,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0,0,0},
            {9,9,9,9,9,9,9,9,9,9,9}
    };

    private static int[][] level9Matrix = {
            {1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,1},
            {1,0,1,1,1,1,1,0,1},
            {1,0,1,0,0,0,1,0,1},
            {1,0,1,0,1,0,1,0,1},
            {1,0,1,0,0,0,1,0,1},
            {1,0,1,1,1,1,1,0,1},
            {1,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1}
    };

    private static int[][] level10Matrix = {
            {9,9,9,9,9,9,9,9,9,9,9},
            {0,0,0,0,9,0,0,0,9,8,0},
            {0,9,6,0,9,0,0,0,9,0,0},
            {0,9,0,0,9,0,9,0,9,0,0},
            {0,9,0,0,9,0,9,0,9,0,0},
            {0,9,0,0,9,6,9,0,9,0,0},
            {0,9,0,8,9,0,9,4,9,0,0},
            {0,9,0,0,9,2,9,0,9,0,0},
            {0,9,0,0,9,0,9,0,9,0,0},
            {0,9,0,0,9,0,9,0,9,0,0},
            {0,9,7,0,0,0,9,0,0,0,0},
            {0,9,0,0,0,0,9,0,0,0,8},
            {0,9,9,9,9,9,9,9,9,9,9},
    };


    private static int[][] level11Matrix = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
            {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
            {9, 9, 9, 9, 2, 2, 2, 9, 9, 9, 9},
            {9, 6, 6, 9, 1, 1, 1, 9, 6, 6, 9},
            {9, 2, 2, 9, 0, 0, 0, 9, 4, 4, 9},
            {9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
            {9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
            {9, 0, 0, 9, 6, 6, 6, 9, 0, 0, 9},
            {9, 1, 1, 9, 9, 9, 9, 9, 1, 1, 9},
    };

    private static int[][] level12Matrix = {
            {0,0,1,1,1,0,1,1,1,0,1,1,1},
            {0,0,1,6,1,0,1,6,1,0,1,6,1},
            {0,0,1,1,1,0,1,1,1,0,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,0,1,1,1,0,1,1,1,0},
            {0,1,2,1,0,1,2,1,0,1,2,1,0},
            {0,1,1,1,0,1,1,1,0,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,0,1,1,1,0,1,1,1,0,0},
            {1,4,1,0,1,4,1,0,1,4,1,0,0},
            {1,1,1,0,1,1,1,0,1,1,1,0,0}
    };

    private static int[][] level13Matrix = {
            {0,0,0,0,0,9,0,0,0,0,0,0,0,0},
            {0,0,0,0,9,4,9,0,0,0,0,0,0,0},
            {0,0,0,9,4,1,4,9,0,0,0,0,0,0},
            {0,0,9,4,1,4,1,4,9,0,0,0,0,0},
            {0,9,4,1,4,6,4,1,4,9,0,0,0,0},
            {9,4,1,4,6,7,6,4,1,4,9,0,0,0},
            {4,1,4,6,7,2,7,6,4,1,4,9,9,9},
            {1,4,6,7,2,8,2,7,6,4,1,4,4,4},
            {4,6,7,2,8,3,8,2,7,6,4,1,1,1},
            {6,7,2,8,3,1,3,8,2,7,6,4,4,4},
            {7,2,8,3,1,0,1,3,8,2,7,6,6,6},
            {2,8,3,1,0,0,0,1,3,8,2,7,7,7},
            {8,3,1,0,0,0,0,0,1,3,8,2,2,2},
            {3,1,0,0,0,0,0,0,0,1,3,8,8,8},
            {1,0,0,0,0,0,0,0,0,0,1,3,3,3},
            {0,0,0,0,0,0,0,0,0,0,0,1,1,1}
    };

    private static int [][] level14Matrix = {
            {7,1,1,7,7,7,7,7,1,1,7},
            {7,1,5,1,7,7,7,1,6,1,7},
            {7,1,5,5,1,1,1,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,1,5,5,5,1,6,6,6,1,7},
            {7,7,1,5,5,1,6,6,1,7,7},
            {7,7,7,1,5,1,6,1,7,7,7},
            {7,7,7,7,1,1,1,7,7,7,7}

    };

    private static int[][] level15Matrix = {
            {0,0,0,0,0,0,0,1,5,1,0,0,0},
            {0,0,0,0,0,0,0,1,5,1,0,0,0},
            {0,0,0,9,9,9,9,1,5,1,9,9,9},
            {0,0,0,9,0,0,0,1,5,1,0,0,0},
            {0,0,0,9,4,4,4,1,5,1,4,4,4},
            {0,0,0,9,7,9,9,1,5,1,9,9,9},
            {0,0,0,9,7,9,0,1,5,1,0,0,0},
            {0,0,0,9,7,9,0,1,5,1,0,0,0},
            {1,1,1,9,7,9,1,1,5,1,0,0,0},
            {0,0,0,9,7,9,0,0,5,1,0,0,0},
            {2,2,2,9,7,9,2,2,2,1,0,0,0},
            {1,1,1,9,7,9,1,1,1,1,0,0,0},
            {0,0,0,9,7,9,0,0,0,0,0,0,0},
            {0,0,0,9,7,9,0,0,0,0,0,0,0}
    };

    private static Bricks[][] bricks;

    private static void level1Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[8][13];

        number_of_level = 1;

        for (int i = 0 ; i < 8 ;i++){
            for (int j=0 ; j < 13 ;j++){
                bricks[i][j] = new Bricks(level1Matrix[i][j]);
                if(level1Matrix[i][j] >= 1) {
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j) + 15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }

    }

    private static void level2Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[11][11];

        number_of_level = 2;

        for (int i = 0 ; i < 11 ;i++){
            for (int j = 0 ; j < 11 ;j++){
                if(level2Matrix[i][j]>=1) {
                    bricks[i][j] = new Bricks(level2Matrix[i][j]);
                }
                else{
                    bricks[i][j]= new Bricks(1);
                }

                if(level2Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j + 1) + 15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level3Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[15][11];
        number_of_level = 3;

        for (int i = 0; i < 15 ;i++){
            for (int j=0 ; j < 11 ;j++){
                if(level3Matrix[i][j]>=1) {
                    bricks[i][j] = new Bricks(level3Matrix[i][j]);
                }
                else{
                    bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level3Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level4Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[14][11];
        number_of_level = 4;

        for(int i = 0;i<14;i++){
            for(int j = 0; j<11;j++){
                bricks[i][j] = new Bricks(level4Matrix[i][j]);
                if(level4Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level5Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[14][11];
        number_of_level = 5;


        for(int i = 0;i<14;i++){
            for(int j =0;j<11;j++){
                if(level5Matrix[i][j]>=1) {
                    bricks[i][j] = new Bricks(level5Matrix[i][j]);
                }
                else{
                    bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level5Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level6Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[11][11];
        number_of_level = 6;


        for(int i = 0;i<11;i++){
            for(int j = 0 ; j<11; j++){
                switch (j){
                    case 0:
                    case 10:
                        if(i!=9){
                            bricks[i][j]=new Bricks(4);
                        }
                        else {
                            bricks[i][j] = new Bricks(8);
                        }
                        break;
                    case 2:
                    case 8:
                        if(i==3||i==Math.pow(3,2)){
                            bricks[i][j] = new Bricks(9);
                        }
                        else {
                            bricks[i][j]=new Bricks(2);
                        }
                        break;
                    case 4:
                    case 6:
                        if(i==3||i==Math.pow(3,2)){
                            bricks[i][j] = new Bricks(9);
                        }
                        else {
                            bricks[i][j]=new Bricks(6);
                        }
                        break;

                    default:
                        bricks[i][j] = new Bricks(8);

                }
                if(level6Matrix[i][j] == 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level7Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[12][7];
        number_of_level = 7;



        for(int i = 0;i<12;i++){
            for(int j = 0; j<7;j++){
                bricks[i][j] = new Bricks(level7Matrix[i][j]);
                if(level7Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(),bricks[i][j].getBrickPosX() + 32 * (j+3)+10, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level8Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[16][11];
        number_of_level = 8;


        for(int i = 0;i<16;i++){
            for (int j = 0 ;j<11;j++){
                if(level8Matrix[i][j]>=1) {
                    bricks[i][j] = new Bricks(level8Matrix[i][j]);
                }
                else{
                    bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level8Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+68, bricks[i][j].getBrickPosY() + 16 * (i) + 6, 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level9Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[9][9];
        number_of_level = 9;


        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                bricks[i][j]=new Bricks(1);
                if(level9Matrix[i][j] == 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1) + 50, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level10Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[13][11];
        number_of_level = 10;


        for(int i = 0;i<13;i++){
            for (int j = 0 ;j<11;j++){
                if(level10Matrix[i][j]>=1) {
                    bricks[i][j] = new Bricks(level10Matrix[i][j]);
                }
                else{
                    bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level10Matrix[i][j] >= 1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1) + 10, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level11Display(Graphics2D g , JPanel panel)
    {
        bricks=new Bricks[11][11];
        number_of_level = 11;

        for (int i=0;i<11;i++) {
            for (int j = 0; j < 11; j++) {
                if (level11Matrix[i][j] >= 1) {
                    bricks[i][j] = new Bricks(level11Matrix[i][j]);
                } else {
                    bricks[i][j] = new Bricks(new Random().nextInt(9) + 1);
                }
                if (level11Matrix[i][j] >= 1) {
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1)+13, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level12Display(Graphics2D g , JPanel panel){
        bricks=new Bricks[11][13];
        number_of_level = 12;


        for(int i=0;i<11;i++){
            for(int j=0;j<13;j++){
                switch (level12Matrix[i][j]){
                    case 1:
                        bricks[i][j]=new Bricks(1);
                        break;
                    case 2:
                        bricks[i][j]=new Bricks(2);
                        break;
                    case 3:
                        bricks[i][j]=new Bricks(3);
                        break;
                    case 4:
                        bricks[i][j]=new Bricks(4);
                        break;
                    case 6:
                        bricks[i][j]=new Bricks(6);
                        break;
                    case 7:
                        bricks[i][j]=new Bricks(7);
                        break;
                    case 8:
                        bricks[i][j]=new Bricks(8);
                        break;
                    case 9:
                        bricks[i][j]=new Bricks(9);
                        break;
                    default:
                        bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level12Matrix[i][j]>=1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j) + 16, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }

            }
        }
    }

    private static void level13Display(Graphics2D g , JPanel panel){
        bricks=new Bricks[16][14];
        number_of_level = 13;


        for(int i=0;i<16;i++){
            for(int j=0;j<14;j++){
                switch (level13Matrix[i][j]){
                    case 1:
                        bricks[i][j]=new Bricks(1);
                        break;
                    case 2:
                        bricks[i][j]=new Bricks(2);
                        break;
                    case 3:
                        bricks[i][j]=new Bricks(3);
                        break;
                    case 4:
                        bricks[i][j]=new Bricks(4);
                        break;
                    case 6:
                        bricks[i][j]=new Bricks(6);
                        break;
                    case 7:
                        bricks[i][j]=new Bricks(7);
                        break;
                    case 8:
                        bricks[i][j]=new Bricks(8);
                        break;
                    case 9:
                        bricks[i][j]=new Bricks(9);
                        break;
                    default:
                        bricks[i][j]= new Bricks(new Random().nextInt(5)+1);
                }
                if(level13Matrix[i][j]>=1){
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j), bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }

            }
        }
    }

    private static void level14Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[12][11];


        number_of_level = 14;


        for(int i=0;i<12;i++) {
            for (int j = 0; j < 11; j++) {
                switch (level14Matrix[i][j]) {
                    case 1:
                        bricks[i][j] = new Bricks(1);
                        break;
                    case 2:
                        bricks[i][j] = new Bricks(2);
                        break;
                    case 3:
                        bricks[i][j] = new Bricks(3);
                        break;
                    case 4:
                        bricks[i][j] = new Bricks(4);
                        break;
                    case 5:
                        bricks[i][j] = new Bricks(5);
                        break;
                    case 6:
                        bricks[i][j] = new Bricks(6);
                        break;
                    case 7:
                        bricks[i][j] = new Bricks(7);
                        break;
                    case 8:
                        bricks[i][j] = new Bricks(8);
                        break;
                    case 9:
                        bricks[i][j] = new Bricks(9);
                        break;
                    default:
                        bricks[i][j] = new Bricks(new Random().nextInt(5) + 1);
                }
                if (level14Matrix[i][j] >= 1) {
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j+1) + 15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    private static void level15Display(Graphics2D g , JPanel panel){
        bricks = new Bricks[14][13];


        number_of_level = 15;


        for(int i=0;i<14;i++) {
            for (int j = 0; j < 13; j++) {
                switch (level15Matrix[i][j]) {
                    case 1:
                        bricks[i][j] = new Bricks(1);
                        break;
                    case 2:
                        bricks[i][j] = new Bricks(2);
                        break;
                    case 3:
                        bricks[i][j] = new Bricks(3);
                        break;
                    case 4:
                        bricks[i][j] = new Bricks(4);
                        break;
                    case 5:
                        bricks[i][j] = new Bricks(5);
                        break;
                    case 6:
                        bricks[i][j] = new Bricks(6);
                        break;
                    case 7:
                        bricks[i][j] = new Bricks(7);
                        break;
                    case 8:
                        bricks[i][j] = new Bricks(8);
                        break;
                    case 9:
                        bricks[i][j] = new Bricks(9);
                        break;
                    default:
                        bricks[i][j] = new Bricks(new Random().nextInt(5) + 1);
                }
                if (level15Matrix[i][j] >= 1) {
                    if (!bricks[i][j].isDestroy()) {
                        g.drawImage(bricks[i][j].getBrickImage(), bricks[i][j].getBrickPosX() + 32 * (j) + 15, bricks[i][j].getBrickPosY() + 16 * (i + 4), 32, 16, panel);
                    }
                }
            }
        }
    }

    public static int[][] getMatrix2D(int level_number) {
        if(level_number == 1) {
            return level1Matrix;
        }
        else if(level_number == 2) {
            return level2Matrix;
        }
        else if(level_number == 3) {
            return level3Matrix;
        }
        else if(level_number == 4) {
            return level4Matrix;
        }
        else if(level_number == 5) {
            return level5Matrix;
        }
        else if(level_number == 6) {
            return level6Matrix;
        }
        else if(level_number == 7) {
            return level7Matrix;
        }
        else if(level_number == 8) {
            return level8Matrix;
        }
        else if(level_number == 9) {
            return level9Matrix;
        }
        else if(level_number == 10) {
            return level10Matrix;
        }
        else if(level_number == 11) {
            return level11Matrix;
        }
        else if(level_number == 12) {
            return level12Matrix;
        }
        else if(level_number == 13) {
            return level13Matrix;
        }
        else if(level_number == 14){
            return level14Matrix;
        }
        else if(level_number == 15){
            return level15Matrix;
        }

        return null;
    }

    // returns the bricks of the levels
    public static Bricks[][] getBricks() {
        return bricks;
    }
    // destroy the brick
    public static void set_Destroy_Matrix2D(int[][] Matrix2D , int i , int j , int number_of_level){
        Matrix2D[i][j] = 0;
        switch (number_of_level){
            case 1 :
                total_number_of_bricks_level1--;
                break;
            case 2:
                total_number_of_bricks_level2--;
                break;
            case 3:
                total_number_of_bricks_level3--;
                break;
            case 4:
                total_number_of_bricks_level4--;
                break;
            case 5:
                total_number_of_bricks_level5--;
                break;
            case 6:
                total_number_of_bricks_level6--;
                break;
            case 7:
                total_number_of_bricks_level7--;
                break;
            case 8:
                total_number_of_bricks_level8--;
                break;
            case 9:
                total_number_of_bricks_level9--;
                break;
            case 10:
                total_number_of_bricks_level10--;
                break;
            case 11:
                total_number_of_bricks_level11--;
                break;
            case 12:
                total_number_of_bricks_level12--;
                break;
            case 13:
                total_number_of_bricks_level13--;
                break;
            case 14:
                total_number_of_bricks_level14--;
                break;
            case 15:
                total_number_of_bricks_level15--;
                break;
        }

    }
    // total number of bricks in each level
    public static int getTotal_number_of_bricks(int number_of_level) {
        switch (number_of_level) {
            case 1:
                return total_number_of_bricks_level1;
            case 2:
                return total_number_of_bricks_level2;
            case 3:
                return total_number_of_bricks_level3;
            case 4:
                return total_number_of_bricks_level4;
            case 5:
                return total_number_of_bricks_level5;
            case 6:
                return total_number_of_bricks_level6;
            case 7:
                return total_number_of_bricks_level7;
            case 8:
                return total_number_of_bricks_level8;
            case 9:
                return total_number_of_bricks_level9;
            case 10:
                return total_number_of_bricks_level10;
            case 11:
                return total_number_of_bricks_level11;
            case 12:
                return total_number_of_bricks_level12;
            case 13:
                return total_number_of_bricks_level13;
            case 14:
                return total_number_of_bricks_level14;
            case 15:
                return total_number_of_bricks_level15;
        }
        return 0;
    }

    public static int getNumber_of_level() {
        return number_of_level;
    }

    public static void setBasicPatterns(){

        total_number_of_bricks_level1 = 8 * 13 ;
        total_number_of_bricks_level2 = 66;
        total_number_of_bricks_level3 = 88;
        total_number_of_bricks_level4 = 114;
        total_number_of_bricks_level5 = 70 ;
        total_number_of_bricks_level6 = 79;
        total_number_of_bricks_level7 = 68;
        total_number_of_bricks_level8 = 50;
        total_number_of_bricks_level9 = 49;
        total_number_of_bricks_level10 =66;
        total_number_of_bricks_level11 =85;
         total_number_of_bricks_level12 =81;
         total_number_of_bricks_level13 =140;
         total_number_of_bricks_level14 =132;
         total_number_of_bricks_level15 =93;




         level1Matrix = new int[][]{
                 {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                 {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                 {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                 {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
                 {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                 {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                 {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7},
                 {8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8}
         };

        level2Matrix = new int[][]{
                {8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 7, 6, 4, 0, 0, 0, 0, 0, 0, 0},
                {8, 7, 6, 4, 2, 0, 0, 0, 0, 0, 0},
                {8, 7, 6, 4, 2, 6, 0, 0, 0, 0, 0},
                {8, 7, 6, 4, 2, 6, 8, 0, 0, 0, 0},
                {8, 7, 6, 4, 2, 6, 8, 7, 0, 0, 0},
                {8, 7, 6, 4, 2, 6, 8, 7, 6, 0, 0},
                {8, 7, 6, 4, 2, 6, 8, 7, 6, 4, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8}
        };

         level3Matrix = new int[][]{
                {6,6,6,6,6,6,6,6,6,6,6},
                {0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,9,9,9,9,9,9,9,9},
                {0,0,0,0,0,0,0,0,0,0,0},
                {2,2,2,2,2,2,2,2,2,2,2},
                {0,0,0,0,0,0,0,0,0,0,0},
                {9,9,9,1,1,1,1,1,1,1,1},
                {0,0,0,0,0,0,0,0,0,0,0},
                {8,8,8,8,8,8,8,8,8,8,8},
                {0,0,0,0,0,0,0,0,0,0,0},
                {4,4,4,9,9,9,9,9,9,9,9},
                {0,0,0,0,0,0,0,0,0,0,0},
                {4,4,4,4,4,4,4,4,4,4,4},
                {0,0,0,0,0,0,0,0,0,0,0},
                {9,9,9,4,4,4,4,4,4,4,4}
        };

        level4Matrix = new int[][]{
                {0,2,2,2,2,0,3,3,3,3,0},
                {0,5,5,5,5,0,4,4,4,4,0},
                {0,7,7,7,7,0,5,5,5,5,0},
                {0,2,2,2,2,0,6,6,6,6,0},
                {0,1,1,1,1,0,1,1,1,1,0},
                {0,4,4,4,4,0,8,8,8,8,0},
                {0,6,6,6,6,0,2,2,2,2,0},
                {0,7,7,7,7,0,3,3,3,3,0},
                {0,4,4,4,4,0,5,5,5,5,0},
                {0,1,1,1,1,0,1,1,1,1,0},
                {0,2,2,2,2,0,2,2,2,2,0},
                {0,4,4,4,4,0,3,3,3,3,0},
                {0,5,5,5,5,0,6,6,6,6,0},
                {0,8,8,8,8,0,7,7,7,7,0}
        };

        level5Matrix = new int[][]{
                {0,0,0,5,0,0,0,5,0,0,0},
                {0,0,0,0,5,0,5,0,0,0,0},
                {0,0,0,0,5,0,5,0,0,0,0},
                {0,0,0,1,1,1,1,1,0,0,0},
                {0,0,0,1,1,1,1,1,0,0,0},
                {0,0,1,1,2,1,2,1,1,0,0},
                {0,0,1,1,2,1,2,1,1,0,0},
                {0,1,1,1,1,1,1,1,1,1,0},
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,0,0,0,0,1,0,1},
                {1,0,1,0,0,0,0,0,1,0,1},
                {1,0,1,1,0,0,0,1,1,0,1},
                {0,0,0,0,1,0,1,0,0,0,0},
                {0,0,0,0,1,0,1,0,0,0,0}
        };

        level6Matrix =  new int[][]{
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,1,1,1,1,1,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0,1}
        };

        level7Matrix = new int[][]{
                {0,0,1,1,1,0,0},
                {0,1,2,2,2,1,0},
                {0,1,3,3,3,1,0},
                {1,4,4,4,4,4,1},
                {1,5,5,5,5,5,1},
                {1,4,4,4,4,4,1},
                {1,6,6,6,6,6,1},
                {1,7,7,7,7,7,1},
                {1,8,8,8,8,8,1},
                {0,1,2,2,2,1,0},
                {0,1,4,4,4,1,0},
                {0,0,1,1,1,0,0}
        };

         level8Matrix = new int[][] {
                {9,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,4,0,0,0,0,0},
                {9,0,0,0,4,7,4,0,0,0,0},
                {9,0,0,4,7,4,7,4,0,0,0},
                {9,0,4,7,4,1,4,7,4,0,0},
                {9,0,0,4,7,4,7,4,0,0,0},
                {9,0,0,0,4,7,4,0,0,0,0},
                {9,0,0,0,0,4,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0,0,0},
                {9,9,9,9,9,9,9,9,9,9,9}
        };

        level9Matrix =new int[][] {
                {1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,0,1},
                {1,0,1,0,0,0,1,0,1},
                {1,0,1,0,1,0,1,0,1},
                {1,0,1,0,0,0,1,0,1},
                {1,0,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1}
        };

        level10Matrix = new int[][]{
                {9,9,9,9,9,9,9,9,9,9,9},
                {0,0,0,0,9,0,0,0,9,8,0},
                {0,9,6,0,9,0,0,0,9,0,0},
                {0,9,0,0,9,0,9,0,9,0,0},
                {0,9,0,0,9,0,9,0,9,0,0},
                {0,9,0,0,9,6,9,0,9,0,0},
                {0,9,0,8,9,0,9,4,9,0,0},
                {0,9,0,0,9,2,9,0,9,0,0},
                {0,9,0,0,9,0,9,0,9,0,0},
                {0,9,0,0,9,0,9,0,9,0,0},
                {0,9,7,0,0,0,9,0,0,0,0},
                {0,9,0,0,0,0,9,0,0,0,8},
                {0,9,9,9,9,9,9,9,9,9,9},
        };


        level11Matrix = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
                {9, 9, 9, 9, 2, 2, 2, 9, 9, 9, 9},
                {9, 6, 6, 9, 1, 1, 1, 9, 6, 6, 9},
                {9, 2, 2, 9, 0, 0, 0, 9, 4, 4, 9},
                {9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
                {9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
                {9, 0, 0, 9, 6, 6, 6, 9, 0, 0, 9},
                {9, 1, 1, 9, 9, 9, 9, 9, 1, 1, 9},
        };

        level12Matrix = new int[][]{
                {0,0,1,1,1,0,1,1,1,0,1,1,1},
                {0,0,1,6,1,0,1,6,1,0,1,6,1},
                {0,0,1,1,1,0,1,1,1,0,1,1,1},
                {0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,0,1,1,1,0,1,1,1,0},
                {0,1,2,1,0,1,2,1,0,1,2,1,0},
                {0,1,1,1,0,1,1,1,0,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,1,0,1,1,1,0,1,1,1,0,0},
                {1,4,1,0,1,4,1,0,1,4,1,0,0},
                {1,1,1,0,1,1,1,0,1,1,1,0,0}
        };

        level13Matrix = new int[][]{
                {0,0,0,0,0,9,0,0,0,0,0,0,0,0},
                {0,0,0,0,9,4,9,0,0,0,0,0,0,0},
                {0,0,0,9,4,1,4,9,0,0,0,0,0,0},
                {0,0,9,4,1,4,1,4,9,0,0,0,0,0},
                {0,9,4,1,4,6,4,1,4,9,0,0,0,0},
                {9,4,1,4,6,7,6,4,1,4,9,0,0,0},
                {4,1,4,6,7,2,7,6,4,1,4,9,9,9},
                {1,4,6,7,2,8,2,7,6,4,1,4,4,4},
                {4,6,7,2,8,3,8,2,7,6,4,1,1,1},
                {6,7,2,8,3,1,3,8,2,7,6,4,4,4},
                {7,2,8,3,1,0,1,3,8,2,7,6,6,6},
                {2,8,3,1,0,0,0,1,3,8,2,7,7,7},
                {8,3,1,0,0,0,0,0,1,3,8,2,2,2},
                {3,1,0,0,0,0,0,0,0,1,3,8,8,8},
                {1,0,0,0,0,0,0,0,0,0,1,3,3,3},
                {0,0,0,0,0,0,0,0,0,0,0,1,1,1}
        };

         level14Matrix = new int[][]{
                {7,1,1,7,7,7,7,7,1,1,7},
                {7,1,5,1,7,7,7,1,6,1,7},
                {7,1,5,5,1,1,1,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,1,5,5,5,1,6,6,6,1,7},
                {7,7,1,5,5,1,6,6,1,7,7},
                {7,7,7,1,5,1,6,1,7,7,7},
                {7,7,7,7,1,1,1,7,7,7,7}

        };

         level15Matrix = new int[][]{
                {0,0,0,0,0,0,0,1,5,1,0,0,0},
                {0,0,0,0,0,0,0,1,5,1,0,0,0},
                {0,0,0,9,9,9,9,1,5,1,9,9,9},
                {0,0,0,9,0,0,0,1,5,1,0,0,0},
                {0,0,0,9,4,4,4,1,5,1,4,4,4},
                {0,0,0,9,7,9,9,1,5,1,9,9,9},
                {0,0,0,9,7,9,0,1,5,1,0,0,0},
                {0,0,0,9,7,9,0,1,5,1,0,0,0},
                {1,1,1,9,7,9,1,1,5,1,0,0,0},
                {0,0,0,9,7,9,0,0,5,1,0,0,0},
                {2,2,2,9,7,9,2,2,2,1,0,0,0},
                {1,1,1,9,7,9,1,1,1,1,0,0,0},
                {0,0,0,9,7,9,0,0,0,0,0,0,0},
                {0,0,0,9,7,9,0,0,0,0,0,0,0}
        };
    }
    public static void determineLevel(int levelNo,JPanel panel,Graphics2D g){
        switch (levelNo) {

            case 1:
                level1Display(g, panel);
                break;
            case 2:
             level2Display(g, panel);
                break;
            case 3:
               level3Display(g, panel);
                break;
            case 4:
            level4Display(g, panel);
                break;
            case 5:
              level5Display(g, panel);
                break;
            case 6:
                level6Display(g, panel);
                break;
            case 7:
             level7Display(g, panel);
                break;
            case 8:
               level8Display(g, panel);
                break;
            case 9:
             level9Display(g, panel);
                break;
            case 10:
                level10Display(g, panel);
                break;
            case 11:
             level11Display(g, panel);
                break;
            case 12:
              level12Display(g, panel);
                break;
            case 13:
                level13Display(g, panel);
                break;
            case 14:
               level14Display(g, panel);
                break;
            case 15:
                level15Display(g, panel);
                break;

        }
    };
}