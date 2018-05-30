package com.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp") //tells Spring Boot that the class will be
                                           //will used for all the properties defined
                                           //in the application.properties that has prefix
                                           //'myapp'
@Data
public class MyAppProperties {

    private String name;
    private String description;
    private String serverIp;

}
