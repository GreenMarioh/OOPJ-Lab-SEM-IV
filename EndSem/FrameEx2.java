import javax.swing.*; // Import all classes from the javax.swing package
public class FrameEx2 extends JFrame{
    JFrame f;
    FrameEx2(){
        JButton b = new JButton("Click Me"); // Create a button with the text "Click Me"
        b.setBounds(130, 100,  100, 40); // Set the position and size of the button
        f = new JFrame(); // Create a new JFrame object
        f.add(b); // Add the button to the frame
        f.setSize(400, 400); // Set the size of the frame
        f.setLayout(null); // Set the layout manager to null (no layout manager)
        f.setVisible(true); // Make the frame visible
    }
    public static void main(String[] args) {
        new FrameEx2(); // Create an instance of FrameEx2 to display the frame
    }
}
