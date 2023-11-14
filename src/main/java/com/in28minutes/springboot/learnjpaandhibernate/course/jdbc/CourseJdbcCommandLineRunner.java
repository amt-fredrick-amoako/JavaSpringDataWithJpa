package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn DSA", "Grokking Algorithms"));
        repository.insert(new Course(2, "Learn Javascript", "Eloquent Javascript"));
        repository.insert(new Course(3, "Pragmatic Programmer", "Micheal Sanders"));
        repository.delete(3);
    }
}
