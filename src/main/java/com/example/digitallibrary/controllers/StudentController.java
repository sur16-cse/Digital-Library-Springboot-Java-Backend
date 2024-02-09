package com.example.digitallibrary.controllers;

import com.example.digitallibrary.dto.StudentCreateRequest;
import com.example.digitallibrary.entities.Student;
import com.example.digitallibrary.services.StudentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@Validated
@RequestMapping("/student")
public class StudentController {
    private static Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("")
    @ResponseStatus(CREATED)
    public void createStudent(@Valid @RequestBody StudentCreateRequest studentCreateRequest) {
        logger.info("request - {}", studentCreateRequest);
        studentService.create(studentCreateRequest);
    }
    @GetMapping("")
    public Student getStudent(@RequestParam("id") Integer id){
        return this.studentService.get(id);
    }

}
