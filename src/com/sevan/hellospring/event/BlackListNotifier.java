package com.sevan.hellospring.event;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;
    
    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        System.out.println(getNotificationAddress() + ": This email has been blocked!");
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public String getNotificationAddress() {
        return notificationAddress;
    }

}
