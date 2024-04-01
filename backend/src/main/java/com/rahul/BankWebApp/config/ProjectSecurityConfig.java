package com.rahul.BankWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> request.requestMatchers("/account", "/balance", "/card", "loan").authenticated()
                        .requestMatchers("/contact", "/notice").permitAll())
                .httpBasic(withDefaults())
                .formLogin(withDefaults());
        return http.build();

    }
}
