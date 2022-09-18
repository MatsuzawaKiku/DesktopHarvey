//this is the class for the display panel

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyFrame{
    static JFrame frame;
    //Character harvey;
    static JPanel panel;
    static JLabel label;
    Random random = new Random();

    /*
    constructor
     */
    public MyFrame(){
        frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        panel = new JPanel();
        label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("harvey.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(50, 30, size.width, size.height); //Sets the location of the image
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }

    //this main method opens a frame
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                //if (e.getX() >= label.getX() + (label.getWidth() / 2)){

                //if (label != null){
                    label.setLocation(e.getX() - label.getWidth()/2 ,e.getY() - label.getHeight()/2);
                //}
//                frame.add(panel);
//                frame.setVisible(true);

            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                label.setLocation(e.getX(),e.getY());
                //frame.add(panel);
                //frame.setVisible(true);
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel message = new JLabel(message());
                panel.setLayout(new FlowLayout());
                panel.add(message);
                frame.add(panel);
                frame.setVisible(true);

            }
        });


    }
    private static String message(){
        ArrayList<String> database = new ArrayList(Arrays.asList("噢！嗨，菊酱。你……要问诊吗？","不要过度劳累，菊酱。这是医嘱！你的健康对我来说很重要。","我很愿意进一步了解你，菊酱。我们先把医患关系抛到一边。"
        ,"你脸色很不错。很好"));
        Random random = new Random();
        int loveMes = random.nextInt(4);
        return database.get(loveMes);
    }


}

