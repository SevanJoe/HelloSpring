package com.sevan.hellospring.bean;

public class SampleBean {
    protected String brand;
    protected String name;
    protected int birthdate;
    
    /**
     * empty constructor
     */
    public SampleBean() {
        
    }
    
    /**
     * constructor with parameters
     * @param brand
     * @param name
     * @param birthdate
     */
    public SampleBean(String brand, String name, int birthdate) {
        this.brand = brand;
        this.name = name;
        this.birthdate = birthdate;
    }

    /** 
     * work method
     */
    public void work() {
        System.out.println(this.toString());
    }

    /**
     * @return description of this bean
     */
    public String toString() {
        return "SampleBean: " + brand + " " + name + " birth on " + birthdate;
    }
}
