package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
	private Map<String, Lote> loteRepositorio = new HashMap<>();
	
	
	public String addLote(Lote lote) {
		loteRepositorio.put(lote.getId(), lote);
		return lote.getId();	
	}
	
	public boolean editaLote(String idLote, Produto produto, int quantidade) {
		loteRepositorio.get(idLote).setProduto(produto);
		loteRepositorio.get(idLote).setQuantidade(quantidade);
		return true;
	}
	
	public boolean removeLote(String id) {
		loteRepositorio.remove(id);
		return true;
	}
	public Lote getLote(String id) {
		return loteRepositorio.get(id);
	}
	
	public ArrayList<Lote> listaLotes() {
		ArrayList lista = new ArrayList();
		for (Lote lote : loteRepositorio.values()) {
			lista.add(lote);
		}
		return lista;
	}
	public Map<String, Lote> getLotes() {
		return this.loteRepositorio;
	}
}
