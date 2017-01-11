package ai.cuddle.instruction.controller;

import ai.cuddle.instruction.dto.RuleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by suman.das on 1/9/17.
 */
@RestController
public class ServiceInstanceRestController {

    @Autowired
    RestTemplate loadBalancedRestTemplate;

    public ResponseEntity<?> executeRule(String serviceName, String version,RuleDTO ruleDTO) {
        String applicationName = serviceName + "-service-"+version;
        String url = "http://" + applicationName + "/rule";
        System.out.println("url " + url);
        ResponseEntity<RuleDTO> response=loadBalancedRestTemplate.postForEntity(url, ruleDTO, RuleDTO.class);
        return response;
    }
}
