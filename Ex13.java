// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:13




import java.awt.event.*;
import javax.swing.*;

public class Ex13 extends JFrame implements ItemListener {
    JCheckBox checkBox1, checkBox2;
    JLabel label;

    Ex13() {
        setTitle("Swing Demo");
        label = new JLabel();
        label.setSize(400, 100);
        checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 100, 50); 
        checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(100, 150, 100, 50); 
        add(checkBox1);
        add(checkBox2);
        add(label);
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox1)
            label.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
        if (e.getSource() == checkBox2)
            label.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
    }

    public static void main(String args[]) {
        new Ex13();
    }
}
