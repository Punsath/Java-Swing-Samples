//import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5;

    MyFrame() {
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");

  //border layout     this.setLayout(new BorderLayout());
                    //this.add(btn1, BorderLayout.NORTH);
                   // this.add(btn2, BorderLayout.EAST);
                   // this.add(btn3, BorderLayout.WEST);
                   // this.add(btn4, BorderLayout.SOUTH);
                   // this.add(btn5, BorderLayout.CENTER);

        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.CENTER);
        f.setHgap(60);
        f.setVgap(50);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);

    }

}

public class Main {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}