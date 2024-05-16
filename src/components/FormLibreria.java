package components;

import javax.swing.*;
import controllers.FormLibreriaController;
import logic.Libreria;

public class FormLibreria extends JPanel {
    private Libreria libreria;
    private FormLibreriaGUI gui;
    private FormLibreriaController controller;

    public FormLibreria() {
        libreria = new Libreria();
        gui = new FormLibreriaGUI();
        controller = new FormLibreriaController(libreria, gui);

        this.add(gui);
    }
}