import javax.swing.*;

public class JFrameEx {
    JFrameEx() {
        JFrame f = new JFrame();
        JButton b = new JButton("Click Me");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JFrameEx s = new JFrameEx();
    }
}
