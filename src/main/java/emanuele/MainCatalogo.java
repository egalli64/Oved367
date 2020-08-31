package emanuele;

import java.util.List;

public class MainCatalogo {
    public static void main(String[] args) {
        Catalogo<Articolo> cat = new Catalogo<>();

        cat.aggiungiArticolo(new Bullone(12.4));
        cat.aggiungiArticolo(new Bullone(2.4));
        
        System.out.println(cat);
        
        List<Articolo> cheap = cat.getArticoliSottoPrezzo(10.0);
        System.out.println(cheap);
    }
}
