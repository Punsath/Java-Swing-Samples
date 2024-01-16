import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JCheckBox check1, check2;
    JTextField textField;

    public MyFrame() {
        check1 = new JCheckBox("Bold");
        check2 = new JCheckBox("Italic");
        textField = new JTextField();
        textField.setColumns(20);

        this.setLayout(new FlowLayout());
        this.add(check1);
        this.add(check2);
        this.add(textField);

        check1.addActionListener(this);
        check2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int bold = 0;
        int italic = 0;

        if (check1.isSelected()) {
            bold = Font.BOLD;
        }
        if (check2.isSelected()) { 
            italic = Font.ITALIC;
        }

        textField.setFont(new Font("Times New Roman", bold | italic, 12));
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