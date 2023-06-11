package br.com.giulianabezerra.authserver;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configurers.OAuth2AuthorizationServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

@Configuration
public class SecurityFilterConfig {

  /*
   * Configura os endpoints do protocolo OpenID e redirecionamento automático para
   * tela de login.
   */
  @Bean
  @Order(1)
  SecurityFilterChain authorizationServerSecurityFilterChain(HttpSecurity http) throws Exception {
    OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);

    http.getConfigurer(OAuth2AuthorizationServerConfigurer.class).oidc(withDefaults());

    http.exceptionHandling((exceptions) -> exceptions
        .authenticationEntryPoint(
            new LoginUrlAuthenticationEntryPoint("/login")))
        .oauth2ResourceServer(conf -> conf.jwt(withDefaults()));

    return http.build();
  }

  /*
   * Configura a segurança e tela de autenticação redirecionada pelo filtro de
   * autorização.
   */
  @Bean
  @Order(2)
  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
      throws Exception {
    http
        .authorizeHttpRequests((authorize) -> authorize
            .anyRequest().authenticated())
        .formLogin(withDefaults());

    return http.build();
  }

}
