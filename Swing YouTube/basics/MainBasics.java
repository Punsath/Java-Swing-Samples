import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MainBasics{
    public static void main(String[] args) {

         Border border = BorderFactory.createLineBorder(Color.green);

         JLabel label = new JLabel();
         label.setText("Hello World");
         label.setHorizontalAlignment(JLabel.CENTER);
         label.setVerticalAlignment(JLabel.TOP);
         label.setForeground(Color.blue);
         label.setBorder(border);

         JFrame frame = new JFrame();
         frame.setTitle("First application");
         frame.setSize(420,420);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(Color.white); 
         frame.setVisible(true);

         frame.add(label);
    }
}