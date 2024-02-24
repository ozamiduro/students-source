package com.assignonek8s.AssigmentOneK8S.service;

import com.assignonek8s.AssigmentOneK8S.entity.StudentEntity;
import com.assignonek8s.AssigmentOneK8S.repository.StudentRepository;
import com.assignonek8s.AssigmentOneK8S.service.API.StudentAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentAPI {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getStudents() {
        return (List<StudentEntity>) studentRepository.findAll();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }
}
