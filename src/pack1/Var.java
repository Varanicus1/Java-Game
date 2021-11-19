package pack1;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
//eine globale datei für alle Variabeln
public class Var { 
    
    //Variable für gui
    static JFrame jf1;
    static int screenwidth=800, screenheight=600;

    //Variable für Spieler 1,2 und ball
    static int x=20, y=185;
    static int gegnerx =740,gegnery= 185;
    static int ballx= screenwidth/2-10, bally=screenheight/2-10;
    static int balldirx =1, balldiry = -1;

    //Variablen für Bewegung
    static boolean  moveup= false, movedown= false;

    //Variabblen für Punkte
    static int playerPoints= 0, gegnerPoints =0;

    //Variablen für schriftart
    static Font pixelfont ;


    //import einer Schriftart
    public Var(){ 

        try{
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Coders_Crux.ttf")));
        }
        catch(FontFormatException | IOException e){
            e.printStackTrace();
        }
    }

}
