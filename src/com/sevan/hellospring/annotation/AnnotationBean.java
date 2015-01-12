package com.sevan.hellospring.annotation;

public class AnnotationBean {

    protected String name;
    
    public AnnotationBean() {}
    
    public AnnotationBean(String name) {
        this.name = name;
    }
    
    public void showName() {
        System.out.println(this.toString() + ": " + name);
    }
}
