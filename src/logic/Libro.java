package logic;

public class Libro {
    private String isbn;
    private String titolo;
    private double prezzo;

    public Libro(String isbn, String titolo, double prezzo) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
