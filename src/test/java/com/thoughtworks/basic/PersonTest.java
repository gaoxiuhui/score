package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    //should-retuen-when--then
    public void should_return_introduction_when_introduce_given_name_is_Tom_and_age_is_21(){
         //given
          String name="Tom";
          int age=21;
          Person person=new Person( name, age);
        //when
        String introduction=person.introduce();
        //then
        assertEquals(introduction, "My name is Tom,my age is 21.");
    }

}
