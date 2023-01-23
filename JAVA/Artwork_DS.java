/*
 * Name: Dilpreet Singh
 * Date: 1/22/2023
 * File name: Artwork_DS.java
 * Description: Create an artwork using java graphics and jframe/javax.swing
 * 
 * R0 - Dilpreet Singh - 1/22/2023 - Original Ver.
 * 
 */
//
import java.awt.*;
import javax.swing.*;
//
public class Artwork_DS extends JPanel {
   final int WIDTH = 800;
   final int HEIGHT = 400;

   // Constructor (panel initialization)
   public Artwork_DS() {
      setPreferredSize(new Dimension(WIDTH,HEIGHT));
   } // end constructor

   public void paintComponent (Graphics page) {
   // "page" is the Graphics object upon which you are drawing
      // your graphics method code goes here, for example ...
      
	  // sky
      page.setColor(Color.decode("#87CEEB"));
      page.fillRect(0,0,getWidth(),getHeight());
      
      // sun!
      page.setColor(Color.yellow);
      page.drawArc(-75, -75, 150, 150, -90, 90);
      page.fillArc(-75, -75, 150, 150, -90, 90);
         
      // Grass!
      page.setColor(Color.decode("#7CFC00"));
      page.drawOval(-100, 300, 1000, 500);
      page.fillOval(-100, 300, 1000, 500);
      
      // george
      page.setColor(Color.black);
      page.drawRect(200, 300, 10, 30);
      page.fillRect(200, 300, 10, 30);
      page.drawLine(200, 310, 180, 290);
      page.drawLine(210, 310, 230, 290);
      page.drawLine(200, 330, 190, 340);
      page.drawLine(210, 330, 220, 340);
      
      // george head
      page.setColor(Color.decode("#8d5524"));
      int[] xPoints = {195,215,220,205,190};
      int[] yPoints = {300,300,280,260,280};
      page.drawPolygon(xPoints, yPoints, xPoints.length);
      page.fillPolygon(xPoints, yPoints, xPoints.length);
      
      // tree!
      page.setColor(Color.decode("#725c42"));
      page.drawRoundRect(200, 200, 100, 200, 30, 30);
      
      
      
      

   } // end paintComponent

   // Starting point for application
   public static void main (String[] args) {
      JFrame frame = new JFrame("Artwork_DS");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new Artwork_DS());
      frame.pack();
      frame.setVisible(true);
   } // end main

} // end class Artwork
