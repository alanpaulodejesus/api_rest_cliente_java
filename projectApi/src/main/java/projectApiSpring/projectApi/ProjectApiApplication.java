package projectApiSpring.projectApi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@OpenAPIDefinition
@Configuration
public class ProjectApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApiApplication.class, args);
	}
//
//	@GetMapping("/")
//	public String index(){
//		return  "Olá Mundo!";
//	}

	@Bean
	public OpenAPI springOpenAi(){
		return new OpenAPI()
				.info( new Info().title( "Cliente Api" )
						.description( "Esta é uma api de Crud de Cliente" )
						.version( "1.0.0" ));
	}
}
