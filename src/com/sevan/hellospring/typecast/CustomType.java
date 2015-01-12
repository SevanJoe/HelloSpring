package com.sevan.hellospring.typecast;

public class CustomType {

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public CustomType(String name) {
        this.name = name;
    }
}
