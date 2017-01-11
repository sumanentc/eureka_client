package ai.cuddle.instruction;

import ai.cuddle.instruction.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by suman.das on 1/5/17.
 */
@SpringBootApplication
@ComponentScan({"ai.cuddle.instruction.*"})
@RibbonClient(name = "client", configuration = RibbonConfig.class)
@EnableDiscoveryClient
public class InstructionApplication {

    public static void main(String[] args){
        SpringApplication.run(InstructionApplication.class);

    }
}
