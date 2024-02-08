package by.arvisit.modsenlibapp.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModsenDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModsenDiscoveryServerApplication.class, args);
    }

}
