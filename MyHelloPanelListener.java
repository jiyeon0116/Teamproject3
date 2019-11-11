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
    public MyHelloPanelListener(){
        
    }
    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        ml.setLocation(x,y);
    }
    public void mouseClicked(MouseEvent e){
    }
    public void keyPressed(KeyEvent e){
        
    }
}
