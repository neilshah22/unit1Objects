import java.awt.Color;
import javax.swing.JFrame;

public class BrightnessDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); 
        frame.setSize(200, 200);
        Color myColor = new Color(0,255,0);
        myColor = myColor.brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
