package com.example.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(String name,int age,String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name; 
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: "+ id +"\nName: "+ name +"\nGrade: "+grade+"\nage: "+age+"\n\n";
    }
}
