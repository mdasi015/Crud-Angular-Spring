package com.mariana.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
//@Table (name = "cursos") --> Caso o nome da tabela do banco de dados não seja igual o nome da classe
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @Column (length = 200, nullable = false) //(name = "nome")
    private String name;

    @Column (length = 10, nullable = false)
    private String category;
}
