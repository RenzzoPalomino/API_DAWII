/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Renzzo
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/swagger-ui/**")
                .allowedOrigins("*") // Permitir acceso desde cualquier origen
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir métodos específicos
                .allowedHeaders("*"); // Permitir todos los encabezados
    }
}
