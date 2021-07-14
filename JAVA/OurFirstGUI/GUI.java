package OurFirstGUI;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class GUI {

        public GUI() {

                JFrame frame = new JFrame("BEST PROGRAM EVER!");

                JPanel panel = new JPanel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(600,500);
                // frame.setResizeable(false); makes it so the box can not be resized.
                frame.getContentPane().setBackground(Color.GRAY);
                // ImageIcon image = new ImageIcon("YTLogo v2.png"); gives the popup an image.
                // frame.setIconImage(image.getImage);
        }
        public static void main(String[] args) {
                new GUI();
        }
}
