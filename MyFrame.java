//this is the class for the display panel

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame{
    static JFrame frame;
    Character harvey;

    /*
    constructor
     */
    public MyFrame(){
        frame = new JFrame();  
    }

    //this main method opens a frame
    public static void main(String[] args) {
        //set size
        //this.resize(ppSimParams.xmax+OFFSET, ppSimParams.ymax+OFFSET)
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("harvey.png");
        MyFrame m=new MyFrame();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        //f.setBackground(new Color(0, 0, 0, 0));
        f.setVisible(true);
        //f.add(new JLabel(new ImageIcon("Path/To/Your/Image.png")));


    }


    public void mouseClicked(MouseEvent e){
        if (e.getX() == 120 && e.getY() == 100){
            //add label
        }
    }

    public void mouseDragged(MouseEvent e){

    }



}

