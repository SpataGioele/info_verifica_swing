package components;

import java.awt.FlowLayout;

import javax.swing.*;

public class Validators extends JPanel {
    private JButton conferma;
    private JButton annulla;

    public Validators() {
        conferma = new JButton("Conferma");
        annulla = new JButton("Annulla");

        // adding
        this.add(conferma);
        this.add(annulla);

        // settings
        this.setLayout(new FlowLayout());
    }

    public JButton getConferma() {
        return conferma;
    }

    public void setConferma(JButton conferma) {
        this.conferma = conferma;
    }

    public JButton getAnnulla() {
        return annulla;
    }

    public void setAnnulla(JButton annulla) {
        this.annulla = annulla;
    }
}
