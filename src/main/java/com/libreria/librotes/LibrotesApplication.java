package com.libreria.librotes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;

@SpringBootApplication
public class LibrotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrotesApplication.class, args);
	}

	@SpringBootApplication
	public static class LibreriaApplication implements CommandLineRunner {

		public static void main(String[] args) {
			SpringApplication.run(LibreriaApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			Principal menu = new Principal();
			menu.muestraElMenu();
		}
	}
}
