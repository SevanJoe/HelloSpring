package com.sevan.hellospring;

import com.sevan.hellospring.annotation.AnnotationBean;
import com.sevan.hellospring.annotation.AppConfig;
import com.sevan.hellospring.annotation.CleanupBean;
import com.sevan.hellospring.annotation.InitBean;
import com.sevan.hellospring.aop.FooService;
import com.sevan.hellospring.bean.SampleBean;
import com.sevan.hellospring.event.EmailService;
import com.sevan.hellospring.typecast.CustomType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import org.springframework.scripting.Messenger;

public class TestSpring {

    public static void main(String[] args) {
        // testAnnotation();

        // testEvent();

        testAOP();

        // ApplicationContext applicationContext = new
        // ClassPathXmlApplicationContext("beans/beanpost.xml");
        // Messenger messenger = (Messenger) applicationContext.getBean("messenger");
        // System.out.println(messenger);

        // BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans/beans.xml");
        //
        // testSampleBean(beanFactory);
        // testFactoryBean(beanFactory);
    }

    private static void testSampleBean(BeanFactory beanFactory) {
        SampleBean sampleBean01 = (SampleBean) beanFactory.getBean("sampleBean");
        sampleBean01.work();

        SampleBean sampleBean02 = (SampleBean) beanFactory.getBean("sampleBean", SampleBean.class);
        sampleBean02.work();

        System.out.println(sampleBean01 == sampleBean02);
    }

    private static void testFactoryBean(BeanFactory beanFactory) {
        SampleBean factoryBean = (SampleBean) beanFactory.getBean("factoryBean", SampleBean.class);
        factoryBean.work();
    }

    private static void testAnnotation() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationBean annotationBean =
                applicationContext.getBean("baseBean", AnnotationBean.class);
        annotationBean.showName();
        InitBean initBean = applicationContext.getBean(InitBean.class);
        CleanupBean cleanupBean = applicationContext.getBean(CleanupBean.class);
    }

    private static void testEvent() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans/beanevent.xml");
        EmailService emailService = (EmailService) applicationContext.getBean("emailService");
        emailService.sendMail("known.spammer@example.org", "test mail");
        emailService.sendMail("known.hacker@example.org", "test mail");
        emailService.sendMail("john.doe@example.org", "test mail");
        emailService.sendMail("sevan.doe@example.org", "test mail");
    }

    private static void testTypeCast() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans/beantype.xml");
        String name = "Hello";
        // CustomType customType = (CustomType) name;
    }

    private static void testAOP() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans/beanaop.xml");
        FooService fooService = (FooService) beanFactory.getBean("fooService");
        fooService.getFoo("Sevan Joe", 24);
    }

}
