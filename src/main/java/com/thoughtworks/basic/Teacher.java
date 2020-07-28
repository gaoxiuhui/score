package com.thoughtworks.basic;

public class Teacher extends  Person{
    private String job;

    public Teacher(String name,int age){
        super(name, age);
        this.job = "teacher";
    }
    @Override
    public String introduce() {
        return super.introduce()+"I am a "+job+".";
    }
    public void receiveMessage(String message){

    }
}
