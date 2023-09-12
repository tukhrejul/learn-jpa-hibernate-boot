package com.in28minute.springboot.learnjpahibernateboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)values(1,'Learn AWS', 'In28Minutes');
                    """;

    private static String INSERT_QUERY_WITH_PARAMETER =
            """
                    insert into course (id, name, author)values(?,?,?);
                    """;
    private static String DELETE_QUERY_WITH_PARAMETER =
            """
                    delete from course where id= ?;
                    """;
    private static String SELECT_QUERY =
            """
                    select * from course where id = ?
                    """;
    public void insert()
    {
        springJdbcTemplate.update(INSERT_QUERY);
    }

    public void insert(Course course)
    {
        springJdbcTemplate.update(INSERT_QUERY_WITH_PARAMETER,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id)
    {
        springJdbcTemplate.update(DELETE_QUERY_WITH_PARAMETER,id);
    }

    public Course selectById(long id)
    {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),
                id);
    }
}
