package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import com.example.model.*;
import com.example.*;
import java.sql.*;

public class StudentDAO {
    public void addStudent(Student student){
        String query ="INSERT INTO students (name,age,grade) values(?,?,?)";
        
    try(Connection conn = DBConnection.getConnection();
        PreparedStatement pstat = conn.prepareStatement(query)){
        
        // Set values from the student object
        pstat.setString(1, student.getName());
        pstat.setInt(2,student.getAge());
        pstat.setString(3,student.getGrade());

        // Execute the insert
        int rowsInserted = pstat.executeUpdate();

        if(rowsInserted > 0){
            System.out.println("Student added successfully.");
        }else{
            System.out.println("Student was not added.");
        }
        }catch(SQLException e){   
            e.printStackTrace();
        }
    }


    public List<Student> getAllStudents(){
        List<Student> students= new ArrayList<>(); 
        String query = "SELECT * FROM students";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstat = conn.prepareStatement(query)){
            
            ResultSet rs = pstat.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");

                Student student = new Student(name, age, grade);
                student.setId(id);
                students.add(student);
            }
            }catch(SQLException e){
                e.printStackTrace();
            }
            return students;
    }

    public void updateStudent(Student student){
        String query = "UPDATE students SET name = ?,age = ?,grade= ? where id = ?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstat = conn.prepareStatement(query)){
            pstat.setString(1,student.getName());
            pstat.setInt(2, student.getAge());
            pstat.setString(3,student.getGrade());

            pstat.setInt(4,student.getId());

            int rowsUpdated = pstat.executeUpdate();

            if(rowsUpdated > 0){
                System.out.println("Student updated successfully");
            }else{
                System.out.println("No student found with id: "+student.getId());
            }
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

    public void deleteStudent(int id){
        String query ="DELETE FROM students WHERE id = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstat = conn.prepareStatement(query)){
            pstat.setInt(1, id);
            int rowsUpdated = pstat.executeUpdate();

            if(rowsUpdated>0){
                System.out.println("Student has been successfully deleted.");
            }else{
                System.out.println("Could not find the student with id: "+ id);
            }
                
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
