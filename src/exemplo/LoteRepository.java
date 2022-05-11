package exemplo;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
	private Map<String, Lote> loteRepositorio = new HashMap<>();
	
	
	public String addLote(Lote lote) {
		loteRepositorio.put(lote.getId(), lote);
		return lote.getId();	
	}
	
	public boolean editaLote(String idLote, String Produto, int quantidade) {
		return true;
	}
}
