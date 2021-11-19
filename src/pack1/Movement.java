package pack1;
import java.util.Timer;
import java.util.TimerTask;

//Bewegung des Spielers
public class Movement {
Timer move;
    public Movement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override public void run(){

                //wenn pfeiltaste nach oben gedrückt ist moveup gleich war und der spieler bewegt sich um 2 nach oben
                if(Var.moveup==true){

                //Spieler bewegt sich solange nach oben bis er an eine Grenze stöhst in dem Fall 20
                    if(Var.y >=20){
                        Var.y = Var.y-2;// alternativ Var.y -=2;
                      }
                }

                //wenn pfeiltaste nach unten gedrückt ist movedown gleich war und der spieler bewegt sich um 2 nach unte
                else if(Var.movedown==true){

                //Spieler bewegt sich solange nach unten bis er an eine Grenze stöhst in dem Fall höhe-200
                    if(Var.y<=Var.screenheight -200){
                        Var.y= Var.y+2; //alternativ Var.y +=2;
                      }
                }
            }


        },0,6 );

    }
}
