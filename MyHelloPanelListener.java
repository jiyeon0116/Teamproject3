import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloPanelListener implements KeyListener,MouseListener
{
    JLabel ml;
    public MyHelloPanelListener(JLabel label){
        
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
    switch(KeyCord){
        case KeyEvent.VK_UP:
        label.setLocation(label.getX(),label.getY()-FlYING_UNIT);break;
    }
}
