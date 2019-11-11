import java.awt.*;
import javax.swing.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2018315058 오타오아키, 2018315022 이지연) 
 * @version (19.11.11)
 */
public class MyHelloFrame extends JFrame
{
    public JPanel mp;
    public JLabel ml;
    private JLabel label = new JLabel("Hello");
    
    public MyHelloFrame(){
        this.setSize(400,300);
        this.setTitle("실습_3(2019.11.11)");

        mp = new JPanel();
        ml= new JLabel();

        mp.add(ml);
        this.add(mp);
        
        mp.addMouseListener();
        mp.addKeyListener();
        this.setLayout(null);
        ml.setSize(50,20);
        ml.setLocation(30,30);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
