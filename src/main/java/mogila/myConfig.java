package mogila;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
// @ComponentScan("mogila")
public class myConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
