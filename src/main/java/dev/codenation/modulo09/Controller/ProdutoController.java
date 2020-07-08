package dev.codenation.modulo09.Controller;

import dev.codenation.modulo09.config.Modulo09Config;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProdutoController {

    @Autowired
    private final Modulo09Config config;

    @GetMapping("/config")
    public String getConfig() {
        return config.getGithubToken();
    }
}
