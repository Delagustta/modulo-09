package dev.codenation.modulo09.Repository;

import com.sun.xml.bind.v2.model.core.ID;
import dev.codenation.modulo09.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, ID> {

}
