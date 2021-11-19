package pack1;

//Main Mithode in der allle Dateien aufgerufen werden und laufen
public class Main {
    public static void main(String[] args) throws Exception {
        
        //Aufruf aller nötigen classen
        new Gui();
        new Var();
        new Movement();
        new GegnerMovement();
        new BallMovement();
        new BallKollision();
    }
}
