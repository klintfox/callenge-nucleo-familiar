package com.app.servicio.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.serviciopersonacommon.entity"})
@SpringBootApplication
public class ServicioPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioPersonaApplication.class, args);
	}

}
