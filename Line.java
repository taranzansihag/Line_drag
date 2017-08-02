import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Line extends Applet implements MouseListener,MouseMotionListener{
 int x,y;
 String s;
 public void init(){
   addMouseListener(this);  
   addMouseMotionListener(this);
 }
 
  public void mouseClicked(MouseEvent e){ }
  public void mousePressed(MouseEvent e){ }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){ }
  public void mouseMoved(MouseEvent e){
   x=e.getX();
   y=e.getY();
   Graphics g=getGraphics();
   g.setColor(Color.red);
    g.drawLine(0,0,x,y);
   
 }
 public void mouseDragged(MouseEvent e){ }
 public void paint(Graphics g){
  
 
  }
   /*<applet code="Line.java" width=1000 height=500> </applet>*/
 } 