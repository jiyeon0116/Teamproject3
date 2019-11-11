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
<<<<<<< HEAD
public class MyHelloPanelListener implements KeyListener,MouseListener
=======
public class MyHelloPanelListener extends KeyAdapter implements KeyListener,MouseListener
>>>>>>> 9dee9f15ad2193a8f4b575c0e6b24805cbaee39d
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

    public void mouseClicked(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}
}
public class MyHellowPanelListener extends KeyAdapter
{
    public JLabel label;
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
    }
<<<<<<< HEAD
    switch(KeyCord){
        case KeyEvent.VK_UP:
        label.setLocation(label.getX(),label.getY()-FlYING_UNIT);break;
=======
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
>>>>>>> 9dee9f15ad2193a8f4b575c0e6b24805cbaee39d
    }
}
