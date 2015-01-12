package com.sevan.hellospring.event;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
    
    private final String address;
    private final String text;

    public BlackListEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

}
