/*
package com.yrhv.appclient.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppClientController {

    private EurekaClient eurekaClient;
    private RestTemplateBuilder restTemplateBuilder;

    public AppClientController(EurekaClient eurekaClient, RestTemplateBuilder restTemplateBuilder) {

        this.eurekaClient = eurekaClient;
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @RequestMapping("/")
    public String callProductService() {

        RestTemplate restTemplate = restTemplateBuilder.build();
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("product-service", false);
        String baseUrl = instanceInfo.getHomePageUrl();
        ResponseEntity<String> responseEntity =
                restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class);
        return responseEntity.getBody();
    }
}
*/
