package com.assignonek8s.AssigmentOneK8S.repository;

import com.assignonek8s.AssigmentOneK8S.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
}
