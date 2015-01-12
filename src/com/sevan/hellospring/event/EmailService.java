package com.sevan.hellospring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {
    
    private List<String> blackList;
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }
    
    public void sendMail(String address, String text) {
        if (blackList.contains(address)) {
            BlackListEvent blackListEvent = new BlackListEvent(this, address, text);
            publisher.publishEvent(blackListEvent);
            return;
        } else {
            System.out.println(address + ": This email has been sent!");
        }
    }

}
