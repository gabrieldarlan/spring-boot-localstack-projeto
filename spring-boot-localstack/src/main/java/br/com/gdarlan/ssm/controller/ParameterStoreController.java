package br.com.gdarlan.ssm.controller;

import br.com.gdarlan.ssm.configuration.ParameterStoreConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ParameterStoreController {

    @Autowired
    private ParameterStoreConfiguration configuration;

    @GetMapping("/parameterStoreConfiguration")
    public String configuration() {
        return configuration.getHelloWorld();

    }
}
