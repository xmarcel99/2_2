package com.calculator.event;

import org.springframework.context.ApplicationEvent;

public class MathLoggerEvent extends ApplicationEvent {

    private String logMessage;

    public MathLoggerEvent(Object source, String logMessage) {
        super(source);
        this.logMessage = logMessage;
    }

    public String getLogMessage() {
        return logMessage;
    }
}
