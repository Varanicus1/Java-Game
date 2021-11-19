package pack1;
import java.util.Timer;
import java.util.TimerTask;

//Bewegung des Gegners
public class GegnerMovement {
    
    Timer move;
    public GegnerMovement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override public void run(){

                //Gegner Bewegt sich nur wenn Ball auf Seiner seite ist
                if(Var.ballx >= Var.screenwidth /2 -10){

                    //will auf die höhe des Balles kommen
                    if(Var.bally == Var.gegnery){
                       
                    }

                    //wenn nicht erfüllt und ball weiter oben als der Gegner ist geht der Gegner zum ball
                    else if(Var.bally > Var.gegnery +75){
                        
                        if(Var.gegnery<= Var.screenheight -200){
                            Var.gegnery +=2;
                        }
                        
                    }

                    //wenn nicht erfüllt und ball weiter unten als der Gegner ist geht der Gegner zum ball
                    else if(Var.bally < Var.gegnery + 75){

                        if(Var.gegnery >=20){
                            Var.gegnery -=2;
                        }
                    }
                }
            }


        },0,6 );

    }
}
