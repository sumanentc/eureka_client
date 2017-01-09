package ai.cuddle.instruction.controller;

import ai.cuddle.instruction.dto.RuleDTO;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by suman.das on 1/9/17.
 */
@RestController
public class ServiceInstanceRestController {
    //@Autowired
    //private DiscoveryClient discoveryClient;

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
    @RequestMapping("/service-instances/{applicationName}")
    public String  serviceInstancesByApplicationName(@PathVariable String applicationName) {
        List<ServiceInstance> list = discoveryClient.getInstances(applicationName);
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }*/

    public ResponseEntity<?> executeRule(String serviceName, String version) {
        String applicationName = serviceName + "-"+version;
        String url = "http://rule-" + applicationName + "/rule";
        RuleDTO ruleDTO = new RuleDTO();
        ruleDTO.setVersion("1.0.0");
        ruleDTO.setLabel("test-rule");
        ruleDTO.setId("1");
        System.out.println("url " + url);
        ResponseEntity<?> response = restTemplate().postForObject(url,ruleDTO,ResponseEntity.class);
        return response;
    }
}
