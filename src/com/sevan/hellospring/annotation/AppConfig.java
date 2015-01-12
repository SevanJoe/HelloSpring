package com.sevan.hellospring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "baseBean")
    public AnnotationBean getAnnotationBean() {
        return new AnnotationBean("New Bean");
    }
    
    @Bean(initMethod = "init")
    @Scope("prototype")
    public InitBean getInitBean() {
        return new InitBean();
    }
    
    @Bean(destroyMethod = "cleanup")
    public CleanupBean getCleanupBean() {
        return new CleanupBean();
    }
}
