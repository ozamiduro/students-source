package com.assignonek8s.AssigmentOneK8S.controller;

import com.assignonek8s.AssigmentOneK8S.entity.StudentEntity;
import com.assignonek8s.AssigmentOneK8S.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<StudentEntity>> getStudents() throws Exception{
        try {
            return new ResponseEntity<List<StudentEntity>>(studentService.getStudents(), HttpStatus.OK);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student) throws Exception {
        try {
            return new ResponseEntity<StudentEntity>(studentService.saveStudent(student), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
