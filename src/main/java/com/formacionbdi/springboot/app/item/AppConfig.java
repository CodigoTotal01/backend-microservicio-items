package com.formacionbdi.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//COnfiguraciones: Permite crear compoenentes (beans y registrar en spring)
@Configuration
public class AppConfig {

	@Bean("clienteRest")
	//cliente para trabajar con api rest - cliente http - acceder a recursos de otros microservicios
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
	//retorno se guarda en el contenedor bean (con el nombre del metodo o nombremos el mean )
}
