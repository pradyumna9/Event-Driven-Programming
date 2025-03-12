package com.example.marriage_service.event;

import org.springframework.context.ApplicationEvent;

public class MarriageEvent extends ApplicationEvent {
    private String name;

    public MarriageEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
