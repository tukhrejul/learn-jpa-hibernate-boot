package com.in28minute.springboot.learnjpahibernateboot.course;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class CourseJpaCommandLineRunner implements CommandLineRunner
{
   // @Autowired
   // private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1,"Spring", "in28minutes"));
        repository.save(new Course(2,"Java", "IBCS-Primax"));
        repository.save(new Course(3,"PHP", "IBCS-Primax"));
        repository.save(new Course(4,"CCNA", "IBCS-Primax"));
        repository.save(new Course(5,"DBA", "IBCS-Primax"));

        repository.deleteById(3l);

        System.out.println(repository.findById(4l).toString());
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor("IBCS%"));
        System.out.println(repository.findByAuthor(""));
    }
}
