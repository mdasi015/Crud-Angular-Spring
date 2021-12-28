package com.mariana.crudspring.controller;

import java.util.List;

import com.mariana.crudspring.model.Course;
import com.mariana.crudspring.repository.CourseRepository;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")

@Component
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    //@RequestMapping(method = RequestMethod.POST)
    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }
}
