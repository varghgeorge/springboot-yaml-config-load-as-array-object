package documentation.single.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableSwagger2
@EnableDiscoveryClient
public class MsDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDocumentationApplication.class, args);
	}
}
