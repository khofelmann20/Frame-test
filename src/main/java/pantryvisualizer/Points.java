package pantryvisualizer;

import javax.swing.JApplet;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Points extends JApplet{
    public void init(){
        setSize(400,400);
        repaint();
    }
    public void draw (int x, int y){
        Graphics page = new Graphics(){
        
            @Override
            public void translate(int x, int y) {
                
            }
        
            @Override
            public void setXORMode(Color c1) {
                
            }
        
            @Override
            public void setPaintMode() {
                
            }
        
            @Override
            public void setFont(Font font) {
                
            }
        
            @Override
            public void setColor(Color c) {
                
            }
        
            @Override
            public void setClip(int x, int y, int width, int height) {
                
            }
        
            @Override
            public void setClip(Shape clip) {
                
            }
        
            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }
        
            @Override
            public Font getFont() {
                return null;
            }
        
            @Override
            public Color getColor() {
                return null;
            }
        
            @Override
            public Rectangle getClipBounds() {
                return null;
            }
        
            @Override
            public Shape getClip() {
                return null;
            }
        
            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
                
            }
        
            @Override
            public void fillRect(int x, int y, int width, int height) {
                
            }
        
            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
                
            }
        
            @Override
            public void fillOval(int x, int y, int width, int height) {
                
            }
        
            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
                
            }
        
            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {
                
            }
        
            @Override
            public void drawString(String str, int x, int y) {
                
            }
        
            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
                
            }
        
            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
                
            }
        
            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
                
            }
        
            @Override
            public void drawOval(int x, int y, int width, int height) {
                
            }
        
            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {
                
            }
        
            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
                    Color bgcolor, ImageObserver observer) {
                return false;
            }
        
            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
                    ImageObserver observer) {
                return false;
            }
        
            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }
        
            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }
        
            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }
        
            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }
        
            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
                
            }
        
            @Override
            public void dispose() {
                
            }
        
            @Override
            public Graphics create() {
                return null;
            }
        
            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {
                
            }
        
            @Override
            public void clipRect(int x, int y, int width, int height) {
                
            }
        
            @Override
            public void clearRect(int x, int y, int width, int height) {
                
            }
        };

        page.drawLine(x,y,x,y);
    }

    public Points(){}
}