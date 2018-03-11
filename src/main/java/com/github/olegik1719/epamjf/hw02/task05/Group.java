package com.github.olegik1719.epamjf.hw02.task05;

import java.util.HashMap;

public class Group<Subject, Grade extends Comparable> {
    private final Subject subject;
    private HashMap<Student,Grade> grades;

    public Group(Subject subject){
        this.subject = subject;
    }

    public boolean isHere(Student student){
        return grades.containsKey(student);
    }

    public Grade getGrade (Student student){
        return grades.get(student);
    }

    public Subject getSubject(){
        return subject;
    }
}
