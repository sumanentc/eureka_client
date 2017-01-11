package ai.cuddle.instruction.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by suman.das on 1/10/17.
 */
@Configuration
public class ClientConfig {

    @LoadBalanced
    @Bean(name="loadBalancedRestTemplate")
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
