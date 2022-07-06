package co.develhope.EnvironmentsVariables01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String msg(){
        String devName = environment.getProperty("myCustomProps.devName");
        String authCode = environment.getProperty("myCustomProps.authCode");
        return devName + " " + authCode;
    }
}