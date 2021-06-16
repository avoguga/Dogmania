package dogmania.model;

import java.beans.BeanProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "produto_id")
	private Long produtoId;
	private String nome;
	private Integer quantidade;
	@Column(name="valor_compra")
	private Float valorCompra;
	@Column(name="valor_venda")
	private Float valorVenda;
	private Date fabricacao;
	private Date validade;
	private String categoria;
	private Marca marca;
	@Column(name="forncededor_id")
	private Integer fornecedorId;

	
	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getValorVenda() {
		return valorCompra;
	}

	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public String getValidade() {
		return fabricacao;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFornecedor() {
		return fornecedorId;
	}

	public void setFornecedor(Integer fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
}
