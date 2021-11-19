package pack1;
import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
Timer kollision;
//Berührt der Ball Spieler oder Gegner oder nh Wand
public BallKollision(){
    kollision = new Timer();
    kollision.scheduleAtFixedRate(new TimerTask() {
        
        @Override public void run (){
            
            //Kollisionsprüfung mit dem Oberen und Unteren Rand im falle von Kollision Richtungswechsel
            //Unten
            if(Var.bally +50 >= Var.screenheight){
                Var.balldiry= -1;
            }
            //Oben
            if(Var.bally <= 0){
                Var.balldiry= 1;
            }

            //Kollisionsprüfung mit dem linken und rechten Rand im falle von Kolision zurücksetzten zum Mittelpunkt und erhöhen der Punkte um 1
            //rechts
            if(Var.ballx +20 >= Var.screenwidth){
                //Zurücksetzen in die Mitte
                Var.ballx=Var.screenwidth/2 -10;
                Var.bally=Var.screenheight/2 -10;

                // Spielerpunkte werden um eins erhöht 
                Var.balldirx= -1;
                Var.playerPoints +=1;
            }

            //links
            if(Var.ballx <= 0){
                //Zurücksetzen in die Mitte
                Var.ballx=Var.screenwidth/2 -10;
                Var.bally=Var.screenheight/2 -10;

                // Gegnerpunkte werden um eins erhöht 
                Var.balldirx= 1;
                Var.gegnerPoints +=1;
            }

            //Kollisionsprüfung mit dem Spieler und dem Gegner im falle von Kollision Richtungswechsel Spieler und Gegner werden als Box behandelt
            //Spielerkollision
            if(Var.ballx <Var.x +25 && Var.ballx > Var.x && Var.bally -20<Var.y +150  && Var.bally> Var.y){
                Var.balldirx = 1;
            }

            //Gegnerkollision
            if(Var.ballx <Var.gegnerx  && Var.ballx > Var.gegnerx -20 && Var.bally -20<Var.gegnery +150  && Var.bally> Var.gegnery){
                Var.balldirx = -1;
            }
        }

    }, 0, 4);
}
}
