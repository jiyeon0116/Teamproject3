
import javax.swing.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{
    public JPanel mp;
    public JLabel ml;
    public MyHelloFrame(){
        this.setSize(400,300);
        this.setTitle("");
        mp = new JPanel();
        ml= new JLabel();

        mp.add(ml);
        this.add(mp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
