package info.wisdomin.spingwithswagger;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class Swaggerconfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/employee.*")).build();
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("www.Wisdomin.info").description("Develoopers Guide- Spring API reference")
				.termsOfServiceUrl("https://www.Wisdomin.info/").version("1.0").build();
	}
}
