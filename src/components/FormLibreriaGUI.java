package components;

import java.awt.*;
import javax.swing.*;

public class FormLibreriaGUI extends JPanel {
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private Validators validators;
    private JLabel result;

    public FormLibreriaGUI() {
        // labels
        l1 = new JLabel("Isbn: ");
        l2 = new JLabel("Titolo: ");
        l3 = new JLabel("Prezzo: ");

        // textfields
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField("0", 20);

        validators = new Validators();

        result = new JLabel();

        // adding
        JPanel p1 = new JPanel(new GridLayout(1, 2));
        JPanel p2 = new JPanel(new GridLayout(1, 2));
        JPanel p3 = new JPanel(new GridLayout(1, 2));
        JPanel p4 = new JPanel(new GridLayout(1, 2));
        JPanel p5 = new JPanel(new GridLayout(1, 2));
        p1.add(l1);
        p1.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p3.add(l3);
        p3.add(tf3);
        p4.add(validators);
        p5.add(result);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);

        // setting
        this.setLayout(new GridLayout(5, 1));
    }

    public JTextField getTf1() {
        return tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public JTextField getTf3() {
        return tf3;
    }

    public JButton getConfermaButton() {
        return validators.getConferma();
    }

    public JButton getAnnullaButton() {
        return validators.getAnnulla();
    }

    public void setResult(String text) {
        result.setText(text);
    }
}
