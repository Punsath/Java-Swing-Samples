import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel label;
    JButton incrementButton, decrementButton;
    int count = 0;

    MyFrame(){
      label = new JLabel();
      label.setText("Hello :"+" "+count);

      incrementButton = new JButton("Increment");
      decrementButton = new JButton("Decrement");

      this.add(label);
      this.add(incrementButton);
      this.add(decrementButton);
      this.setLayout(new FlowLayout());

      incrementButton.addActionListener(this);
      decrementButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == incrementButton){
            count++;
        }
        if(e.getSource() == decrementButton){
            count--;
        }
        label.setText("Hello :"+" "+count);
    }
}

public class IncrementDecrement{
    public static void main(String[] args) {

         MyFrame frame = new MyFrame();
         frame.setTitle("Application");
         frame.setSize(420,420);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(Color.white); 
         frame.setVisible(true);

        
    }
}