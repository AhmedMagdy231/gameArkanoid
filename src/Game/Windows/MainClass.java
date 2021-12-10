package Game.Windows;



import javax.swing.*;
import java.awt.*;

public class MainClass{
   private static MainWindow  window = new MainWindow();
   private static JFrame mainframe = new JFrame();


    public static void main(String[] args) {


        //setup frame
        mainframe.setSize(800, 600);
        mainframe.setTitle("Arkanoid");
        mainframe.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainframe.setResizable(false);
        mainframe.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\Data\\Images\\Icon.png");
        mainframe.setIconImage(icon);



        //add the window to frame
        mainframe.add(window);
         window.drawMenu();




        mainframe.setVisible(true);

    }

    public static MainWindow getWindow() {
        return window;
    }


}
