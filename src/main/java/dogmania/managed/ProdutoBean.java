package dogmania.managed;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dogmania.model.Produto;
import service.ProdutoService;

@Named
@ViewScoped
public class ProdutoBean implements Serializable {
	
 private static final long serialVersionUID = 1L;
 
 private Produto produto;
 
 @Inject
 private ProdutoService produtoService;
 
 public ProdutoBean() {
	 	
 this.produto = new Produto();
 }
 
 public List<Produto> getProdutos() {
 return this.produtoService.listarTodos();
 }
 public String salvar() {
 this.produtoService.salvar(produto);
 return "consultar?faces-redirect=true";
 }
 public Produto getAnimal() {
 return produto;
 }
 public void setAnimal(Produto produto) {
 this.produto = produto;
}
}