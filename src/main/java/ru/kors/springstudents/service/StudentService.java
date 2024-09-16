package ru.kors.springstudents.service;

import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;

import java.util.List;

@Service

public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().firstName("Бекасыл").email("bekasyl@gmail.com").age(20).build(),
                Student.builder().firstName("Бекжан").email("bekzhan@gmail.com").age(18).build(),
                Student.builder().firstName("Бибинур").email("bibinur@gmail.com").age(17).build()
        );
    }
}
