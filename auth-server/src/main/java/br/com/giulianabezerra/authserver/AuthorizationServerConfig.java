package br.com.giulianabezerra.authserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings;

@Configuration
public class AuthorizationServerConfig {
  /* Apenas constroi o AS com as configurações desejadas. */
  @Bean
  AuthorizationServerSettings authorizationServerSettings() {
    return AuthorizationServerSettings.builder().build();
  }
}
