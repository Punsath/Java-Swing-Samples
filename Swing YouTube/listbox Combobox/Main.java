import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener; 

class MyFrame extends JFrame implements ListSelectionListener, ActionListener{
    JList listBox;
    JComboBox comboBox;

    MyFrame() {
       String[] languages = {"java", "Python", "JavaScripts", "C#", "C++", "PHP"};

       listBox = new JList<>(languages);
       listBox.setVisibleRowCount(4);

       comboBox = new JComboBox<>(languages);
       comboBox.addActionListener(this);

       listBox.addListSelectionListener(this);

       this.setLayout(new FlowLayout());
       this.add(new JScrollPane(listBox));
       this.add(comboBox);
    }

    public void valueChanged(ListSelectionEvent e){
        if(e.getSource() == listBox){
            System.out.println(listBox.getSelectedValuesList());
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comboBox){
           System.out.println(comboBox.getSelectedItem()); 
        }
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