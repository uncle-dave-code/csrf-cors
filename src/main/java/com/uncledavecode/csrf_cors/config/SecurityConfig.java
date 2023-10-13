package com.uncledavecode.csrf_cors.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> {
            auth.anyRequest().permitAll();
        });

        /* CSRF */
//        http.csrf(AbstractHttpConfigurer::disable); Avoid this
//        http.csrf(csrf -> {
//            csrf.ignoringRequestMatchers(request -> "/csrf".equals(request.getRequestURI()));
//        });


        //CORS
        http.cors(cors -> {
            cors.configurationSource(request -> {
                var corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
                corsConfiguration.setAllowedOrigins(java.util.List.of("http://127.0.0.1:8080"));
                corsConfiguration.setAllowedMethods(java.util.List.of("GET", "POST"));
                corsConfiguration.setAllowedHeaders(java.util.List.of("*"));
                return corsConfiguration;
            });
        });

        return http.build();
    }
}
