package exemplo;

import java.util.ArrayList;

public class ProdutoService {
	ProdutoRepository prodRep = new ProdutoRepository();
	LoteRepository loteRep = new LoteRepository();
	public ArrayList listaProdutosLoteByName(String nome) {
		ArrayList<Produto> lista_produtos = new ArrayList();
		ArrayList<Produto> lista_produtos_nome = new ArrayList();
		getProdsFromLote(lista_produtos);
		getProductsByName(nome, lista_produtos, lista_produtos_nome);
		return lista_produtos_nome;	
	}
	private void getProductsByName(String nome, ArrayList<Produto> lista_produtos,
			ArrayList<Produto> lista_produtos_nome) {
		for (Produto produto : lista_produtos ) {
			if (produto.getNome().contains(nome) ) {
				lista_produtos_nome.add(produto);
			}
		}
	}

	private void getProdsFromLote(ArrayList<Produto> lista_produtos) {
		for (Lote lote : loteRep.listaLotes()) {
			lista_produtos.add(lote.getProduto()); 
		}
	}
	
}
