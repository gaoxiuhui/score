package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KlassTest {
    @Test
    public void should_assign_teacher_successfully() {
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher("Matt", 30);
        klass.assigen(teacher);
        assertEquals("Matt",klass.getTeacher().getName());
        assertEquals(30,klass.getTeacher().getAge());
    }

    @Test
    public void should_have_multiple_students_in_it() {
        Klass klass = new Klass(2);
        Student tom = new Student("Tom", 21, klass);
        Student jim = new Student("Jim", 28, klass);
        klass.append(tom);
        klass.append(jim);
        List<Student> students = klass.getStudents();
        assertEquals(2,students.get(0).getKlass().getKlassNumber());
        assertEquals(2,students.size());
        assertEquals("Tom",students.get(0).getPerson().getName());
        assertEquals(21,students.get(0).getPerson().getAge());
        assertEquals("Jim",students.get(1).getPerson().getName());
        assertEquals(28,students.get(1).getPerson().getAge());
    }
}
