package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI springShopOpenAPI() {
		OpenAPI openAPI = new OpenAPI();
		//Aqui é onde setamos título, versão e info da OpenAPI do projeto.
		Info info = new Info(); 
		info.title("Biblioteca G&P"); 
		info.version("v0.0.1"); 
		openAPI.info(info); 
		info.description("<h2>Descreve a comunicação com o sistema Biblioteca G&P</h2> <p>Aceito <strong>html</strong> normalmente!</p>");
		
		openAPI.addTagsItem(new Tag().name("Livro").description("Gerencia os livros do sistema"));
		openAPI.addTagsItem(new Tag().name("Autor").description("Gerencia os autores do sistema"));
		
		return openAPI;
	}
}
