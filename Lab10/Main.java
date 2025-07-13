import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is a Label:");
        frame.add(label);

        JTextField textField = new JTextField(20);
        frame.add(textField);

        JTextArea textArea = new JTextArea(5, 20);
        frame.add(new JScrollPane(textArea));

        JCheckBox checkBox = new JCheckBox("Check me");
        frame.add(checkBox);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        JButton button = new JButton("Click Me");
        frame.add(button);

        ImageIcon imageIcon = new ImageIcon("k.png");
        JLabel imageLabel = new JLabel(imageIcon);
        frame.add(imageLabel);

        frame.setVisible(true);
    }
}
