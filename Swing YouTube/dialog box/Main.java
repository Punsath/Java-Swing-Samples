import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is yoyr name?");
       // if (name != null){
         //   JOptionPane.showMessageDialog(null, "Your name is"+ name);
        //}

        //JOptionPane.showMessageDialog(null, "This is a message", "Title", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "This is a message", "Title", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}