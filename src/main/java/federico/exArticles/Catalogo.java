package federico.exArticles;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T extends Articolo> {
	private List<T> data;
	
	public Catalogo() {
		this.data = new ArrayList<>();
	}
	
	void aggiungiArticolo(T art) {
		this.data.add(art);
	}
	
	public List<T> getArticoliSottoPrezzo(double prezzo) {
		List<T> result = new ArrayList<>();
		
		for (T cur : this.data) {
			if (cur.getPrezzo() < prezzo) {
				result.add(cur);
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
	
	
}
