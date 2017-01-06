package ai.cuddle.instruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by suman.das on 1/5/17.
 */
@SpringBootApplication
@ComponentScan({"com.cuddle.instruction"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);

    }
}
