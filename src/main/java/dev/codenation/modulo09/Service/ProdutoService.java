package dev.codenation.modulo09.Service;

import dev.codenation.modulo09.Repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoService {

    private ProdutoRepository repository;


}
