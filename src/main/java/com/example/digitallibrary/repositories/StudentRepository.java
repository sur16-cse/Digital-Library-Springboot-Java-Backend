package com.example.digitallibrary.repositories;

import com.example.digitallibrary.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
