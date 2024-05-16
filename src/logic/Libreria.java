package logic;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libri;

    public Libreria() {
        libri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public int contaLibriPerIsbn(String isbn) {
        int count = 0;
        for (Libro libro : libri) {
            if (libro.getIsbn().equals(isbn)) {
                count++;
            }
        }
        return count;
    }

    public int getTotaleLibri() {
        return libri.size();
    }
}