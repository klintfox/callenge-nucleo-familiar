package com.app.servicio.pariente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.serviciopersonacommon.audit.AuditorAwareImpl;

@EntityScan({ "com.serviciopersonacommon.entity", "com.serviciopersonacommon.audit" })
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@SpringBootApplication
public class ServicioParienteApplication {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new AuditorAwareImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServicioParienteApplication.class, args);
	}

}