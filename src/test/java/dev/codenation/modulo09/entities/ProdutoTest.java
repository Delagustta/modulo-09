package dev.codenation.modulo09.entities;

import dev.codenation.modulo09.entity.Produto;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTest {

    @Test
    public void criaNovoProduto(){

        Produto produto = Produto.builder()
                .id(12L)
                .descricao("peixe")
                .build();

        MatcherAssert.assertThat(produto.getId(), Matchers.is(12L));

    }
}
