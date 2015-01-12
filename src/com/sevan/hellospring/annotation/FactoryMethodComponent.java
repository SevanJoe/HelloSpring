package com.sevan.hellospring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {

    @Bean
    @Qualifier("public")
    public AnnotationBean publicInstance() {
        return new AnnotationBean("publicInstance");
    }
}
