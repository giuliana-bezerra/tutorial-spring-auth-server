package br.com.giulianabezerra.authserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserStoreConfig {
  /*
   * Usuários cadastrados no AS, exemplo de implementação em memória mas poderia
   * ser via banco.
   */
  @Bean
  public UserDetailsService userDetailsService() {
    var userDetailsManager = new InMemoryUserDetailsManager();
    userDetailsManager.createUser(
        User.withUsername("user")
            .password("{noop}password")
            .roles("USER")
            .build());
    return userDetailsManager;
  }
}
