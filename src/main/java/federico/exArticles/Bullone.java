package federico.exArticles;

public class Bullone implements Articolo {
	private final String nome = "Bullone";
    private double prezzo;

    public Bullone(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPrezzo() {
        return this.prezzo;
    }

    @Override
    public String toString() {
        return "Bullone [nome=" + nome + ", prezzo=" + prezzo + "]";
    }
}
