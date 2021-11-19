package pack1;
import javax.swing.JLabel;
import java.awt.*;

//zeichnen der Gegenstände auf der Zeichenfläche
public class Draw extends JLabel{ 

    protected void paintComponent(Graphics g){

        //Definition von Draw Graphics
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON ); //Pixeldichte wird verbessert

        /*====================
             Gegenstände
        ====================*/ 

        //hintergrund
        g.setColor(new Color(0,0,0)); //alternativ zu new Color(0,0,0) auch möglich new Color.BLACK
        g.fillRect(0, 0, Var.screenwidth, Var.screenwidth); 

       //mittellinie
        g.setColor(Color.white);
        for(int i = 0; i<=30; i++){ 
         g.fillRect(Var.screenwidth/2 -5, i*20, 10, 10);
        }
        
        //Spieler 1,2 und Ball
        g.fillRect(Var.x, Var.y, 25, 150); //spieler 1
        g.fillRect(Var.gegnerx, Var.gegnery, 25, 150); //spieler 2
        g.fillRect(Var.ballx, Var.bally,20, 20); //ball
        

        
        //Anzeige des Punktestandes
        g.setFont(Var.pixelfont); 
        g.drawString("" + Var.playerPoints, Var.screenwidth/2 -95, 75);
        g.drawString("" + Var.gegnerPoints, Var.screenwidth/2 +50, 75);

        repaint();

    }
}
