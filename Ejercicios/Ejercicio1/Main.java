package ejercicios.ejercicio1;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{

    private static final long serialVercionUID = 1L;
    public Main() {
        this.setSize(300,200);
        this.setVisible(true);

    }
        public static void main(String args[]){
            Main window = new Main();
            window.addWindowListener(new windowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
        }
    }
}
