import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(leite, 10L);
		Produto pao = new Produto("Pão", "Padaria 2 irmaos");
		Produto ovo = new Produto("Ovos", "Distrubuidora 2 irmaos");
		
		ProdutoRepository catalogo = new ProdutoRepository();
		catalogo.addProduto(leite);
		catalogo.addProduto(pao);
		catalogo.addProduto(ovo);
		
		String resultado = catalogo.listaProdutos();
		System.out.println(resultado);
	}
}
