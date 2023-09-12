package com.in28minute.springboot.learnjpahibernateboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCOmmandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        /*repository.insert();
        repository.insert(new Course(2,"Java", "IBCS-Primax"));
        repository.insert(new Course(3,"PHP", "IBCS-Primax"));
        repository.insert(new Course(4,"CCNA", "IBCS-Primax"));
        repository.insert(new Course(5,"DBA", "IBCS-Primax"));

        repository.delete(3);
        System.out.println(repository.selectById(4).toString());*/
    }
}
