package com.github.jbarseg.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

@Bean
SecurityFilterChain web(HttpSecurity http) throws Exception {
	http.securityMatcher("/api/products/save**", "/api/products//delete/{productId}", "/api/categories/save", "/api/categories/delete/{categoryId}", "/api/purchases/save")
            .authorizeHttpRequests(authorize -> authorize
            .requestMatchers("/api/products/save**", "/api/products//delete/{productId}", "/api/categories/save", "/api/categories/delete/{categoryId}", "/api/purchases/save").hasRole("ADMIN")
		);
	return http.build();
}

}
