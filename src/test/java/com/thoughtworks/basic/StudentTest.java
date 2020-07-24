package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_introduction_when_introduce_name_Tom_age_21_class_2(){
       //given
        Student student=new Student("Tom",21,2);
        //when
        String introduction=student.introduce();
        //then
        assertEquals(introduction, "My name is Tom.my age is 21.I am a student of class 2.");
    }
}
