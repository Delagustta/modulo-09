package dev.codenation.modulo09.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "modulo09")
public class Modulo09Config {

    private String githubToken;
    private boolean useDefaultAlgumaCoisa;
}
