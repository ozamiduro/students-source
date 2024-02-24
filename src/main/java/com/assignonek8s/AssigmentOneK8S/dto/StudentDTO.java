package com.assignonek8s.AssigmentOneK8S.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentDTO {

    private Integer id;

    private String fullName;

    private Integer age;

    private String career;
}
