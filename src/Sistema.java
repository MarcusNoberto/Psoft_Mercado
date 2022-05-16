import java.util.ArrayList;

import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(leite, 10L);
		Produto pao = new Produto("Pão", "Padaria 2 irmaos");
		Produto ovo = new Produto("Ovos", "Distrubuidora 2 irmaos");
		Produto leite_em_po = new Produto("Leite em po", "distribuidora pereira");
		
		ProdutoRepository catalogo = new ProdutoRepository();
		catalogo.addProduto(leite);
		catalogo.addProduto(pao);
		catalogo.addProduto(ovo);
		catalogo.addProduto(leite_em_po);
		
		ArrayList resultado = catalogo.getProdutoByName("Leite");
		System.out.println(resultado);
	}
}
