import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
   JLabel label;
   JButton button;
   JTextField textField;

    MyFrame(){
        textField = new JTextField();
        textField.setColumns(15);
        textField.setText("welcome");

        button = new JButton("Click");
        
        label = new JLabel("Empty field");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            label.setText(textField.getText());
        }
    }
}

public class TextfieldExample {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white); 
        frame.setVisible(true);

   }
}
