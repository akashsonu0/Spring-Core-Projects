package in.pwskills.akash.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.pwskills.akash")
@ImportResource(locations ="in/pwskills/akash/cfgs/applicationContext.xml")
public class AppConfig {
	
	
 }

