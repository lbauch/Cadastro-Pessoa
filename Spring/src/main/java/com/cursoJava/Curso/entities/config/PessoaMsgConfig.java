/*
package com.cursoJava.Curso.entities.config;

import java.util.Queue;

import javax.naming.Binding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaMsgConfig {

	public static final String NOME_FILA = "FilaUsuario";
	public static final String NOME_EXCHANGE = "ExchangeUsuario";
	public static final String ROUTING_KEY = "criaUsuario";
	
	@Bean
	DirectExchange usuarioExcahnge() {
		return new DirectExchange(NOME_EXCHANGE);
	}
	
	@Bean
	Queue queue() {
		return QueueBuilder.durable(NOME_FILA).build();
	}
	
	@Bean
	Binding binding() {
		return BindingBuilder.bind(queue()).to(usuarioExchange()).with(ROUTING_KEY);
	}
}
*/
