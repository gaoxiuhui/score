package com.thoughtworks.basic;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is "+name+".my age is "+age+".";
    }
    public void setName(String name){
        this.name=name;
    }
    public String  getName( ){
         return name;
    }
    public void setAge(int  age){
        this.age=age;
    }
    public int  getAge( ){
        return age;
    }
}
