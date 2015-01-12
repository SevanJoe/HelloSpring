package com.sevan.hellospring.annotation;

public class InitBean extends AnnotationBean {
    public void init() {
        // init logic
        System.out.println(this.toString() + ": initializating...");
    }
}
