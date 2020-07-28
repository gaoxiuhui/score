package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_introduction_when_introduce_name_Tom_age_21_job_teacher(){
        //given
        Teacher teacher=new Teacher("Matt",21);
        //when
        String introduction=teacher.introduce();
        //then
        assertEquals(introduction, "My name is Matt.my age is 21.I am a teacher.");
    }
}
