import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315058 오타오아키, 2018315022 이지연) 
 * @version (19.11.11)
 */
public class MyHelloPanelListener extends KeyAdapter implements KeyListener,MouseListener
{
    JLabel ml;
    public MyHelloPanelListener(JLabel label){
        ml = label;
    }
    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        ml.setLocation(x,y);
    }
    public void mouseClicked(MouseEvent e){
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void mouseReleased(MouseEvent e){
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
}
