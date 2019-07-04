package twd.aremiti.diy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class AremitiDiyBackendApplication {

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"API Aremiti DIY",
				"API de gestion des packages et tickets speciaux",
				"0.1",
				"",
				new Contact("TWD", "http://www.tahitiwebdesign.com", "contact@tahitiwebdesign.com"),
				"", "", Collections.emptyList());
	}

	public static void main(String[] args) {
		SpringApplication.run(AremitiDiyBackendApplication.class, args);
	}

}
