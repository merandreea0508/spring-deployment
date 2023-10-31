package com.example.springdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDeploymentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDeploymentApplication.class, args);

        // Get the UserService bean and call the logUserData method
        UserService userService = context.getBean(UserService.class);
        userService.logUserData();

        // Close the application context when done
        //  context.close();

       //SpringApplication.run(SpringDeploymentApplication.class, args);
    }
}                                                                                                           
