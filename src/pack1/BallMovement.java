package pack1;
import java.util.Timer;
import java.util.TimerTask;
//Die Ballbewegung
public class BallMovement {
Timer move;
    public BallMovement(){
        move= new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override public void run(){
                
              //Rechne dauerhaft Ballrichtung auf Positionen des Balles
                Var.ballx += Var.balldirx;
                Var.bally += Var.balldiry;
            }
            
        }, 0, 4);
    }
}
