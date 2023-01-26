package br.com.acrtech.planningpoker.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlanningPokerFrontEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanningPokerFrontEndApplication.class, args);
    }

}
