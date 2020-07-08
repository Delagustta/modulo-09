package dev.codenation.modulo09.repository;

import dev.codenation.modulo09.Repository.ProdutoRepository;
import dev.codenation.modulo09.entity.Produto;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository repository;

    @Test
    @Transactional
    public void quandoEncontraDescricao() {

        Optional<Produto> result = repository.findById(1L);

        MatcherAssert.assertThat(result.get().getDescricao(), Matchers.is("Peixe") );
    }

}
