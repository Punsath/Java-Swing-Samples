import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
   JButton button;
   JTextArea textArea;

    MyFrame(){
      textArea = new JTextArea(10,40);

      button = new JButton("Add Text");

      this.setLayout(new FlowLayout());
      this.add(textArea);
      this.add(button);

      button.addActionListener(this); //enable action listner according to the button
    }

  public void actionPerformed(ActionEvent e){
      if (e.getSource() == button){
        textArea.insert("Hello", textArea.getCaretPosition());
      }
  }
   
}

public class Main {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

   }
}
