package com.example.vitekpirate.mapper;

import com.example.vitekpirate.dto.AddGroupRequestDto;
import com.example.vitekpirate.dto.GetAllGroupResponseDto;
import com.example.vitekpirate.entity.Group;
import com.example.vitekpirate.entity.Student;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
class GroupMapperTest {

    @Autowired
    GroupMapper mapper;

    @Test
    @Disabled
    void fromAddGroupRequestDto() {

        // given
        AddGroupRequestDto dto = new AddGroupRequestDto();
        dto.setName("IT404");

        // when
        Group actual = mapper.fromAddGroupRequestDto(dto);

        // then
        assertEquals("IT404", actual.getName());
    }

    @Test
    @Disabled
    void fromGroup() {

        // given
        Group group = new Group();
        List<Student> students = new ArrayList<>();
        LocalDate date;

        group.setId(1);
        group.setName("IT404");
        group.setStudents(students);

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Mike");
        student1.setSurname("Lebowski");
        student1.setRegistrationDate(LocalDate.now());
        student1.setGroup(group);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("John");
        student2.setSurname("Smith");
        student2.setRegistrationDate(LocalDate.now());
        student2.setGroup(group);

        students.add(student1);
        students.add(student2);

        // when
        GetAllGroupResponseDto actual = mapper.fromGroup(group);

        // then
        assertEquals(1, actual.getId());
        assertEquals("IT404", actual.getName());
        assertEquals(2, actual.getStudentsQuantity());
    }
}