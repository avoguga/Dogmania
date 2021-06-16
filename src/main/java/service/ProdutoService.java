package service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dogmania.model.Produto;
import dogmania.repository.ProdutoRepositoryJPA;

import java.util.List;

@ApplicationScoped
public class ProdutoService {

    @Inject
    ProdutoRepositoryJPA produtoRepository;

    public List<Produto> listarTodos() {
        return this.produtoRepository.listarTodos();
    }

    public void salvar(Produto produto) {
        this.produtoRepository.salvar(produto);
    }

    public void remover(Produto produto) {
        this.produtoRepository.remover(produto);
    }

}