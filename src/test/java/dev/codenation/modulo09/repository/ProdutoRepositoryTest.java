package dev.codenation.modulo09.repository;

import dev.codenation.modulo09.Repository.ProdutoRepository;
import dev.codenation.modulo09.entity.Produto;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository repository;

    @Test
    @Transactional
    public void whenSaveProduct() {
        Produto produto = Produto.builder()
                .descricao("peixe")
                .build();

        Produto result = repository.save(produto);

        MatcherAssert.assertThat(result.getId(), Matchers.is(1L));
    }

}
