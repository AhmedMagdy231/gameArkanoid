package Game.Gameplay;


import java.util.Timer;
import java.util.TimerTask;

public class Current_Time {

    private int second_TIME = 0;

    public Current_Time()

    {
        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                second_TIME++;

            }
        };
        time.scheduleAtFixedRate(task, 1000, 1000);
    }

    public void setSecondTIME(int second_TIME) {
        this.second_TIME = second_TIME;
    }

    public int getSecondTIME()
    {
        return second_TIME;
    }
}

