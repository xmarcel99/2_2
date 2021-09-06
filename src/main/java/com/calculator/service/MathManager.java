package com.calculator.service;

import com.calculator.CalculatorApplication;
import com.calculator.event.MathLoggerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MathManager implements ApplicationListener<MathLoggerEvent> {

    @Override
    public void onApplicationEvent(MathLoggerEvent event) {
        CalculatorApplication.logger.info(event.getLogMessage());
    }
}
