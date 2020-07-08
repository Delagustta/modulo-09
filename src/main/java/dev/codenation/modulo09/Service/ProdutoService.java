package dev.codenation.modulo09.Service;

import dev.codenation.modulo09.Repository.ProdutoRepository;
import dev.codenation.modulo09.entity.Produto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;


    public Produto save() {
        Produto produto = Produto.builder()
                .descricao("peixe")
                .build();
        return repository.save(produto);
    }
}
