import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String toString(){
        return name + " - " + phoneNumber;
    }
}

class MyFrame extends JFrame implements ActionListener{
    private DefaultListModel<String> listModel;
    private JList<String> contactList;

    JPanel inputPanel, mainPanel, buttoPanel;
    JLabel nameLabel, phoneLabel;
    JTextField namField, phoneField;
    JButton addButton, deleteButton;

    MyFrame() {
        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);

      inputPanel = new JPanel(new GridLayout(2,2));
      
      nameLabel = new JLabel("Name");
      phoneLabel = new JLabel("Phone Number: ");

      namField = new JTextField();
      phoneField = new JTextField();

      inputPanel.add(nameLabel);
      inputPanel.add(namField);
      inputPanel.add(phoneLabel);
      inputPanel.add(phoneField);

      addButton = new JButton("Add Contact");
      deleteButton = new JButton("Delete Button");

      addButton.addActionListener(this);
      deleteButton.addActionListener(this);

      buttoPanel = new JPanel(new FlowLayout());
      buttoPanel.add(addButton);
      buttoPanel.add(deleteButton);

      

      mainPanel = new JPanel(new BorderLayout());
      mainPanel.add(inputPanel, BorderLayout.NORTH);
      mainPanel.add(new JScrollPane(contactList),BorderLayout.CENTER);
      mainPanel.add(buttoPanel, BorderLayout.SOUTH);

      this.add(mainPanel);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == addButton) {
            String name = namField.getText();
            String phoneNumber = phoneField.getText();

            Contact contact = new Contact(name, phoneNumber);
            listModel.addElement(contact.toString());

            namField.setText("");
            phoneField.setText("");
        }
        if (e.getSource() == deleteButton) {
            int selectedIndex = contactList.getSelectedIndex();
            if (selectedIndex != -1){
                listModel.remove(selectedIndex);
            }
        }
    }
   
}

public class Main {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("Contact Management System");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}