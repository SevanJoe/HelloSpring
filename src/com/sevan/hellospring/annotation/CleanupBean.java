package com.sevan.hellospring.annotation;

public class CleanupBean extends AnnotationBean {
    public void cleanup() {
        // destruction logic
        System.out.println(this.toString() + ": destructing...");
    }
}
