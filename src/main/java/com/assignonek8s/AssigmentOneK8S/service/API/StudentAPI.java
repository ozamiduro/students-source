package com.assignonek8s.AssigmentOneK8S.service.API;

import com.assignonek8s.AssigmentOneK8S.entity.StudentEntity;

import java.util.List;

public interface StudentAPI {
    public List<StudentEntity> getStudents();

    public StudentEntity saveStudent(StudentEntity student);
}
