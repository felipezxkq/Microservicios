package ubb.electivo.anteproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class AnteProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnteProyectoApplication.class, args);
	}

}
