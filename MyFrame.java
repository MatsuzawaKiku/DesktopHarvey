//this is the class for the display panel

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyFrame{
    static JFrame frame;
    //Character harvey;
    static JPanel panel;
    static JLabel label;
    static Container c;

    /*
    constructor
     */
    public MyFrame(){
        frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
        //c = frame.getContentPane();
        label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("harvey.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(50, 30, size.width, size.height); //Sets the location of the image
    }

    //this main method opens a frame
    public static void main(String[] args) {
        //set size
        //this.resize(ppSimParams.xmax+OFFSET, ppSimParams.ymax+OFFSET)
        //Toolkit t = Toolkit.getDefaultToolkit();
        //Image i = t.getImage("harvey.png");
        MyFrame m = new MyFrame();
       //panel = new JPanel();

        c = frame.getContentPane();
//        label = new JLabel(); //JLabel Creation
//        label.setIcon(new ImageIcon("harvey.png")); //Sets the image to be displayed as an icon
        //Dimension size = label.getPreferredSize(); //Gets the size of the image
        //label.setBounds(50, 30, size.width, size.height); //Sets the location of the image
        //label.setOpaque(false);
        //frame.setBackground(new Color(0, 0, 0, 0));
        c.add(label);


       // frame.add(new JLabel("嗨，菊酱"));

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //if (e.getX() >= label.getX() + (label.getWidth() / 2)){
                c.add(new JLabel("嗨，菊酱"));
                label.setLocation(e.getX(),e.getY());
                //}
            }
        });
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                label.setLocation(e.getX(),e.getY());
            }
        });

        frame.setVisible(true);
    }


}

