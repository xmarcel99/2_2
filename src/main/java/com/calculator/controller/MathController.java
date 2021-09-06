package com.calculator.controller;

import com.calculator.event.MathLoggerEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/math")
public class MathController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    @GetMapping(path = "add")
    public int add(@RequestParam int a, @RequestParam int b) {
        publisher.publishEvent(new MathLoggerEvent(this, "Adding numbers: " + a + " , " + b + " was called"));
        return a + b;
    }

    @GetMapping(path = "subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        publisher.publishEvent(new MathLoggerEvent(this, "Subtracting numbers: " + a + " , " + b + " was called"));
        return a - b;
    }

    @GetMapping(path = "multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        publisher.publishEvent(new MathLoggerEvent(this, "Multiplication numbers: " + a + " , " + b + " was called"));
        return a * b;
    }

    @GetMapping(path = "divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        publisher.publishEvent(new MathLoggerEvent(this, "Division numbers: " + a + " , " + b + " was called"));
        return a / b;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
