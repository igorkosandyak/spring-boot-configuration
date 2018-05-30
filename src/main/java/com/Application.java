package com;

import com.config.MyAppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);
    }

    @Value("${myapp.server-ip}")
    String serverIp;

    @Autowired
    MyAppProperties props; //creates instance of MyAppProperties type

    @Bean
    CommandLineRunner preExecution() {
        return args -> {
            logger.info("##### -> ServerIP: "+serverIp);
            logger.info("##### -> App Name: "+this.props.getName());
            logger.info("##### -> ServerIP: "+this.props.getDescription());
        };
    }
}
