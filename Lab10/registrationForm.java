import javax.swing.*;

public class registrationForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 400);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        JLabel label = new JLabel("Registration Form");
        label.setBounds(50, 50, 200, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(200, 50, 150, 30);
        frame.add(textField);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 100);
        frame.add(textArea);

        JCheckBox checkBox = new JCheckBox();
        frame.add(checkBox);
        checkBox.setBounds(50, 200, 30, 30);
        JLabel label2 = new JLabel("Checkbox Test");
        label2.setBounds(54, 200, 200, 30);
        frame.add(label2);
    }

}