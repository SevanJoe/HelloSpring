package com.sevan.hellospring.bean;

public class SampleFactory {

    /**
     * factory method to create SampleBean
     * @return
     */
    public SampleBean newInstance() {
        return new SampleBean("Instance Factory", "bean", 201501072);
    }
}
