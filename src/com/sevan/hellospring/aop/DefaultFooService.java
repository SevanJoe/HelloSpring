package com.sevan.hellospring.aop;

public class DefaultFooService implements FooService {

    @Override
    public Foo getFoo(String name, int age) {
        return new Foo(name, age);
    }

}
