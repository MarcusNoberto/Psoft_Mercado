package exemplo;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class ProdutoRepository {
	private Map<String, Produto> catalogo = new HashMap<>();
	
	public String addProduto(Produto produto) {
		catalogo.put(produto.getId(), produto);
		return produto.getId();
	}
	
	public boolean editaProduto(String idProduto,String nome, String fabricante) {
		catalogo.get(idProduto).setNome(nome);
		catalogo.get(idProduto).setFabricante(fabricante);
		return true;
	}
	
	public boolean removeProduto(String idProduto) {
		catalogo.remove(idProduto);
		return true;
	}
	
	public Produto getProduto(String idProduto) {
		return catalogo.get(idProduto);
	}
	
	public String listaProdutos() {
		String lista = "";
		for (Produto produto: catalogo.values()) {
			lista += produto.toString() + "\n";
		}
		return lista;
	}
	
	public ArrayList getProdutoByName(String produtoNome) {
		ArrayList<Produto> lista = new ArrayList();
		for (Produto produto : catalogo.values()) {
			if (produto.getNome().contains(produtoNome.toLowerCase())) {
				lista.add(produto);
			}
		}
		return lista;
	}
}
