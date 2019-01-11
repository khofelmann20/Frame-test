package pantryvisualizer;

import java.util.ArrayList;
import java.awt.Point;
import java.util.Arrays;
import pantryvisualizer.math.Translation2d;
import java.awt.Frame;
import javax.swing.*;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;


public class Visualizer extends JFrame{ 
    JFrame frame = new JFrame(); 
  
    Visualizer(){ 
        setTitle("This is the title");
 
        // creates instance of JButton 
       JButton button1 = new JButton(" "); 
  
        button1.setBounds(200, 150, 5, 5); 
          
        // setting close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // adds button in JFrame 
        frame.add(button1); 
    
        frame.setSize(600, 600); // sets 500 width and 600 height 
           
        frame.setLayout(null); // uses no layout managers
          
        frame.setVisible(true); // makes the frame visible 
    } 
    public void paint (Graphics g){
        Graphics2D g2 = (Graphics2D) g; 
        int x = 150;
        int y = 150;
        int rectwidth = 10;
        int rectheight = 50;
        g2.draw(new Ellipse2D.Double(x, y, rectwidth, rectheight));
    }
    public static void main(String[] args) { 
        new Visualizer();
        // Points p = new Points();

        // p.init();
        // p.draw(10,10);
    } 
   


} 



