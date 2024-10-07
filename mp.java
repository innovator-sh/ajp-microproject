import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mp extends JFrame implements ActionListener {

    JLabel l;
    JRadioButton jb[] = new JRadioButton[4];
    JButton b1;
    ButtonGroup bg;
    int count = 0, current = 0;
    JScrollPane scrollPane;
    JTextArea codeBox = new JTextArea(20, 50);

    String Q7 = "System.out.println(10 + 20 + 'Java');";
    String Q9 = "int a = 5;\n" +
            "System.out.println(a++);";

    mp(String s) {
        super(s);
        setLayout(null);
        codeBox.setFont(new Font("Serif", Font.BOLD, 15));

        l = new JLabel();
        l.setBounds(30, 40, 450, 20);
        add(l);

        scrollPane = new JScrollPane(codeBox);
        scrollPane.setBounds(300, 80, 250, 100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVisible(false);
        add(scrollPane);

        JPanel pane = new JPanel(new BorderLayout());
        pane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 10px padding on all sides
        pane.setBackground(Color.WHITE);
        pane.add(codeBox);

        // Adding the panel with padding to the scroll pane
        scrollPane.setViewportView(pane);

        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            jb[i] = new JRadioButton();
            jb[i].setBounds(50, 80 + i * 30, 200, 20);
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1 = new JButton("Next");
        b1.setBounds(100, 220, 100, 30);
        add(b1);
        b1.addActionListener(this);
        set();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 350);
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
                JOptionPane.showMessageDialog(this, "Your Score is " + count+" / 10");
                System.exit(0);
            }
        }
    }

    void set() {
        bg.clearSelection();
        if (current == 0) {
            l.setText("Q1: What is the size of an int data type in Java?");
            jb[0].setText("4 bytes");
            jb[1].setText("8 bytes");
            jb[2].setText("2 bytes");
            jb[3].setText("Depends on the system");
        }
        if (current == 1) {
            l.setText("Q2: Which of the following is not a Java feature?");
            jb[0].setText("Object - Oriented");
            jb[1].setText("Portable");
            jb[2].setText("Dynamic and Extensible");
            jb[3].setText("Pointers");
        }
        if (current == 2) {
            l.setText("Q3: Which of the following is a valid keyword in Java?");
            jb[0].setText("interface");
            jb[1].setText("string");
            jb[2].setText("Float");
            jb[3].setText("unsigned");
        }
        if (current == 3) {
            l.setText("Q4: What is the default value of a local variable in Java?");
            jb[0].setText("null");
            jb[1].setText("0");
            jb[2].setText("undefined");
            jb[3].setText("Compiler Error");
        }
        if (current == 4) {
            l.setText("Q5: In which memory area are the string objects stored?");
            jb[0].setText("Stack");
            jb[1].setText("Heap");
            jb[2].setText("String Constant Pool");
            jb[3].setText("Register");
        }
        if (current == 5) {
            l.setText("Q6: Which of the following is used to find and fix bugs in Java programs?");
            jb[0].setText("JVM");
            jb[1].setText("JRE");
            jb[2].setText("JDK");
            jb[3].setText("JDB");
        }
        if (current == 6) {
            l.setText("Q7: What is the result of the following expression in Java?");
            jb[0].setText("Java1020");
            jb[1].setText("30Java");
            jb[2].setText("Java30");
            jb[3].setText("1020Java");
            codeBox.setText(Q7);
            scrollPane.setBounds(300, 80, 300, 45);
            codeBox.setVisible(true);
            scrollPane.setVisible(true);
        }

        if (current != 6 && current != 8) {
            codeBox.setVisible(false);
            scrollPane.setVisible(false);
        }

        if (current == 7) {
            l.setText("Q8: Which of the following is not a valid access modifier in Java?");
            jb[0].setText("private");
            jb[1].setText("protected");
            jb[2].setText("public");
            jb[3].setText("void");
        }
        if (current == 8) {
            l.setText("Q9: What is the output of the following code?");
            jb[0].setText("5");
            jb[1].setText("6");
            jb[2].setText("Compiler Error");
            jb[3].setText("Runtime Error");
            codeBox.setText(Q9);
            scrollPane.setBounds(300, 100, 200, 60);
            codeBox.setVisible(true);
            scrollPane.setVisible(true);
        }
        if (current == 9) {
            l.setText("Q10: Which method must be implemented by all Java threads?");
            jb[0].setText("start()");
            jb[1].setText("stop()");
            jb[2].setText("run()");
            jb[3].setText("main()");
        }
    }

    boolean check() {
        if (current == 0) {
            return (jb[0].isSelected());
        }
        if (current == 1) {
            return (jb[3].isSelected());
        }
        if (current == 2) {
            return (jb[0].isSelected());
        }
        if (current == 3) {
            return (jb[2].isSelected());
        }
        if (current == 4) {
            return (jb[2].isSelected());
        }
        if (current == 5) {
            return (jb[3].isSelected());
        }
        if (current == 6) {
            return (jb[1].isSelected());
        }
        if (current == 7) {
            return (jb[3].isSelected());
        }
        if (current == 8) {
            return (jb[0].isSelected());
        }
        if (current == 9) {
            return (jb[2].isSelected());
        }
        return false;
    }

    public static void main(String s[]) {
        new mp("Java Online Test");
    }
}
