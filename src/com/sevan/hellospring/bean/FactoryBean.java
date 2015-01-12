package com.sevan.hellospring.bean;


public class FactoryBean extends SampleBean {

    private static FactoryBean factoryBean = null;

    /**
     * default constructor of FactoryBean
     */
    private FactoryBean() {
        this.brand = "Factory";
        this.name = "Bean from factory";
        this.birthdate = 201501071;
    }

    /**
     * factory method
     * @return FactoryBean created by factory
     */
    public static FactoryBean getInstance() {
        if (null == factoryBean) {
            factoryBean = new FactoryBean();
        }
        return factoryBean;
    }
}
