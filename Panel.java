//this is the class for the display panel

import java.awt.*;
import java.awt.*;
import javax.swing.JFrame;

public class Panel extends Canvas{

//    public void paint(Graphics g) {
//        Toolkit t=Toolkit.getDefaultToolkit();
//        Image i=t.getImage("p3.gif");
//        g.drawImage(i, 120,100,this);
//
//        
    //this main method opens a frame
    public static void main(String[] args) {
        Panel m=new Panel();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);

        }

}

