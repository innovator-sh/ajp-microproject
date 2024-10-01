import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineTest extends JFrame implements ActionListener {

    JLabel l;
    JRadioButton jb[] = new JRadioButton[4];
    JButton b1;
    ButtonGroup bg;
    int count = 0, current = 0;

    OnlineTest(String s) {
        super(s);
        setLayout(null);

        // Create label for question
        l = new JLabel();
        l.setBounds(30, 40, 450, 20);
        add(l);

        // Create radio buttons for options
        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            jb[i] = new JRadioButton();
            jb[i].setBounds(50, 80 + i * 30, 200, 20);
            add(jb[i]);
            bg.add(jb[i]);
        }

        // Create button for next
        b1 = new JButton("Next");
        b1.setBounds(100, 240, 100, 30);
        add(b1);

        // Add action listener to button
        b1.addActionListener(this);

        // Set default values
        set();

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);
        setLocation(250, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (check()) {
                count = count + 1;
            }
            current++;
            set();
            if (current == 10) {
                JOptionPane.showMessageDialog(this, "correct ans=" + count);
                System.exit(0);
            }
        }
    }

    void set() {
        jb[3].setSelected(true);
        if (current == 0) {
            l.setText("Que1: Which one among these is not a primitive datatype?");
            jb[0].setText("int");
            jb[1].setText("Float");
            jb[2].setText("boolean");
            jb[3].setText("char");
        }
        if (current == 1) {
            l.setText("Que2: Which class is available to all the class automatically?");
            jb[0].setText("Swing");
            jb[1].setText("Applet");
            jb[2].setText("Object");
            jb[3].setText("ActionEvent");
        }
        if (current == 2) {
            l.setText("Que3: Which package is directly available to our class without importing it?");
            jb[0].setText("swing");
            jb[1].setText("applet");
            jb[2].setText("net");
            jb[3].setText("lang");
        }
        if (current == 3) {
            l.setText("Que4: String class is defined in which package?");
            jb[0].setText("lang ");
            jb[1].setText("Swing");
            jb[2].setText("Applet");
            jb[3].setText("awt");
        }
        if (current == 4) {
            l.setText("Que5: Which institute is best for java coaching?");
            jb[0].setText("Utek");
            jb[1].setText("Aptech");
            jb[2].setText("SSS IT");
            jb[3].setText("jtek");
        }
        if (current == 5) {
            l.setText("Que6: Which one among these is not a keyword?");
            jb[0].setText("class");
            jb[1].setText("int");
            jb[2].setText("get");
            jb[3].setText("if");
        }
        if (current == 6) {
            l.setText("Que7: Which one among these is not a class? ");
            jb[0].setText("Swing");
            jb[1].setText("Actionperformed");
            jb[2].setText("ActionEvent");
            jb[3].setText("Button");
        }
        if (current == 7) {
            l.setText("Que8: which one among these is not a function of Object class?");
            jb[0].setText("toString");
            jb[1].setText("finalize");
            jb[2].setText("equals");
            jb[3].setText("getDocumentBase");
        }
        if (current == 8) {
            l.setText("Que9: which function is not present in Applet class?");
            jb[0].setText("init");
            jb[1].setText("main");
            jb[2].setText("start");
            jb[3].setText("destroy");
        }
        if (current == 9) {
            l.setText("Que10: Which one among these is not a valid component?");
            jb[0].setText("JButton");
            jb[1].setText("J List");
            jb[2].setText("JButtonGroup");
            jb[3].setText("JTextArea");
        }
    }

    boolean check() {
        if (current == 0) {
            return (jb[1].isSelected());
        }
        if (current == 1) {
            return (jb[2].isSelected());
        }
        if (current == 2) {
            return (jb[3].isSelected());
        }
        if (current == 3) {
            return (jb[0].isSelected());
        }
        if (current == 4) {
            return (jb[2].isSelected());
        }
        if (current == 5) {
            return (jb[2].isSelected());
        }
        if (current == 6) {
            return (jb[1].isSelected());
        }
        if (current == 7) {
            return (jb[3].isSelected());
        }
        if (current == 8) {
            return (jb[1].isSelected());
        }
        if (current == 9) {
            return (jb[2].isSelected());
        }
        return false;
    }

    public static void main(String s[]) {
        new OnlineTest("Online Test Of Java");
    }
}