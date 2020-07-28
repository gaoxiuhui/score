package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private List<Student> students=new ArrayList<>();
    private Teacher teacher;
    private int klassNumber;

    public Klass(int klassNumber){
        this.klassNumber = klassNumber;
    }

    public void assigen(Teacher teacher){
         this.teacher=teacher;
    }
    public void append(Student student){
        this.students.add(student);
    }
    public int getKlassNumber(){
        return klassNumber;
    }
    public void setKlassNumber(int klassNumber){
        this.klassNumber=klassNumber;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void setStudents( List<Student> students){
        this.students=students;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public void sendMessage(String message){
        teacher.receiveMessage(message);
        for(Student student:students){
            student.receiveMessage(message);
        }
    }

}
