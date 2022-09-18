//this is the class for the display panel

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class MyFrame extends JFrame {
    static JLabel label;
    static Random random;
    static JPanel panel;
    int x,y;

    /*
    constructor
     */
    public MyFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);


        panel = new JPanel();
        //panel layout = null can custom component location
        panel.setLayout(null);
        panel.setOpaque(false);
        this.add(panel);

        label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("harvey.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(0, 0, size.width, size.height); //Sets the location of the image
        panel.add(label);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });

        label.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JLabel j1 = (JLabel) e.getSource();
                j1.setLocation(j1.getX() + e.getX() - x, j1.getY() + e.getY()-y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        this.setUndecorated(true);
        this.setBackground(new Color(0,0,0,0));
        this.setVisible(true);
    }

    //this main method opens a frame
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();




    }
    private static String message(){
        ArrayList<String> database = new ArrayList(Arrays.asList("噢！嗨，菊酱。你……要问诊吗？","不要过度劳累，菊酱。这是医嘱！你的健康对我来说很重要。","我很愿意进一步了解你，菊酱。我们先把医患关系抛到一边。"
        ,"你脸色很不错。很好"));
        random = new Random();
        int loveMes = random.nextInt(4);
        return database.get(loveMes);
    }


}

