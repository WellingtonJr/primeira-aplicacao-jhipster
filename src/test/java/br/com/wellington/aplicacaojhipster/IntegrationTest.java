package br.com.wellington.aplicacaojhipster;

import br.com.wellington.aplicacaojhipster.PrimeiraAplicacaoJHipsterApp;
import br.com.wellington.aplicacaojhipster.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { PrimeiraAplicacaoJHipsterApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
