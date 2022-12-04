package com.example.repository.impl;

import com.example.model.Student;
import com.example.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository implements IStudentRepository {

    private static List<Student> studentList = new ArrayList<>();

    static  {
        studentList.add(new Student(1,"Jonh",0,new String[]{"Java","C++","C"}));
        studentList.add(new Student(2,"Messi",1,new String[]{"Java","C"}));
        studentList.add(new Student(3,"Ronaldo",1,new String[]{"PHP"}));
        studentList.add(new Student(4,"Son",1,new String[]{"C"}));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> findByName(String keyword) {
        List<Student> result = new ArrayList<>();
        for (Student student:studentList) {
            if(student.getName().contains(keyword)){
                result.add(student);
            }
        }
        return result;
    }
}
