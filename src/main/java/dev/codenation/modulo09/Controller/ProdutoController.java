package dev.codenation.modulo09.Controller;

import dev.codenation.modulo09.Service.ProdutoService;
import dev.codenation.modulo09.entity.Produto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProdutoController {

    //private final Modulo09Config config;

    private final ProdutoService service;

    @GetMapping("/produto")
    public Produto getNovoProduto() {
        return service.save();
    }
}
