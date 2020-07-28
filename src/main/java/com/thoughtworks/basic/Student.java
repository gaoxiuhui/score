package com.thoughtworks.basic;

public class Student  {
    private  Person person;
    private Klass klass;

    public Student(String name,int age ,Klass klass){
        this.person=new Person(name,age);
        this.klass = klass;
    }
    public String introduce() {
     return person.introduce()+"I am a student of class "+klass.getKlassNumber()+".";
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public Klass getKlass(){
        return klass;
    }
    public void setKlass(Klass klass){
        this.klass=klass;
    }
    public void changeName(String name){
        person.setName(name);
        String message="My name is "+person.getName()
                +".I am "+person.getAge()+" years old.I am a student of class "
                + klass.getKlassNumber()+"now.";
        klass.sendMessage(message);
    }
    public void changeClass(int klassNumber){
        int oldClassNumber=klass.getKlassNumber();
        klass.setKlassNumber(klassNumber);
        String message="My name is "+person.getName()
                +".I am "+person.getAge()+" years old.I am a student of class "
                + klass.getKlassNumber()+"now.";
        klass.sendMessage(message);
    }
    public void receiveMessage(String message){

    }
}
