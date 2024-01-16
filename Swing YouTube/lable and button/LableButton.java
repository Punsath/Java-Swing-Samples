import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {

    MyFrame(){
        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        JButton button = new JButton();
        button.setText("Click me");


        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(button);
        
    }
}

public class LableButton{
    public static void main(String[] args) {

         MyFrame frame = new MyFrame();
         frame.setTitle("Application");
         frame.setSize(420,420);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(Color.white); 
         frame.setVisible(true);

        
    }
}