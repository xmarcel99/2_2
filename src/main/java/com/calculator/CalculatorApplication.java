package com.calculator;

import com.calculator.service.MathManager;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static Logger logger = Logger.getLogger(MathManager.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(CalculatorApplication.class, args);
    }

}
