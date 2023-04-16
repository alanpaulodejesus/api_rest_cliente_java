package projectApiSpring.projectApi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springOpenAi(){
        return new OpenAPI()
                .info( new Info().title( "Cliente Api" )
                        .summary("Api Cliente")
                        .description("Esta é uma simples api de Crud de Cliente")
                        .version( "1.0.0" ));
    }
}
