package controllers;

import javax.swing.*;

import components.FormLibreriaGUI;
import java.awt.event.*;
import logic.Libreria;
import logic.Libro;

public class FormLibreriaController implements ActionListener {
    private Libreria libreria;
    private FormLibreriaGUI gui;

    public FormLibreriaController(Libreria libreria, FormLibreriaGUI gui) {
        this.libreria = libreria;
        this.gui = gui;
        
        // add action listeners to buttons
        gui.getConfermaButton().addActionListener(this);
        gui.getAnnullaButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JButton button = (JButton) e.getSource();

            switch (button.getText()) {
                case "Conferma":
                    String isbn = gui.getTf1().getText();
                    String titolo = gui.getTf2().getText();
                    double prezzo = Double.parseDouble(gui.getTf3().getText());
                    Libro libro = new Libro(isbn, titolo, prezzo);
                    libreria.aggiungiLibro(libro);
                    int copieLibro = libreria.contaLibriPerIsbn(isbn);
                    int totaleLibri = libreria.getTotaleLibri();
        
                    gui.setResult("<html>Libro registrato con successo.<br>Copie del libro: " + copieLibro +
                        "<br>Totale libri in libreria: " + totaleLibri + "</html>");
                    break;
                case "Annulla":
                    gui.getTf1().setText("");
                    gui.getTf2().setText("");
                    gui.getTf3().setText("");
                    gui.setResult("");
                    break;
                default:
                    System.out.println("- - Error - -");
                    break;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}