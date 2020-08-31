package com.servicio.tipo.parentesco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.serviciotipoparentescocommons.entity"})
@SpringBootApplication
public class ServicioTipoParentescoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTipoParentescoApplication.class, args);
	}

}
