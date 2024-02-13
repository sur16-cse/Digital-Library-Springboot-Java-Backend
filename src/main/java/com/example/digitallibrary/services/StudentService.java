package com.example.digitallibrary.services;

import com.example.digitallibrary.dto.StudentCreateRequest;
import com.example.digitallibrary.entities.Student;
import com.example.digitallibrary.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StudentService {
@Autowired
StudentRepository studentRepository;


    public void create(StudentCreateRequest createRequest){
        Student student=createRequest.to();
        studentRepository.save(student);
    }

    public Student get(Integer id) {
       return  this.studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
