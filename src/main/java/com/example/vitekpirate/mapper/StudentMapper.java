package com.example.vitekpirate.mapper;

import com.example.vitekpirate.dto.AddStudentRequestDto;
import com.example.vitekpirate.dto.GetStudentByGroupResponseDto;
import com.example.vitekpirate.dto.StudentDto;
import com.example.vitekpirate.entity.Group;
import com.example.vitekpirate.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Mapping(target = "groupName", source = "group.name")
    @Mapping(target = "groupId", source = "group.id")
    GetStudentByGroupResponseDto fromGroupAndStudentDtoList(Group group, List<StudentDto> studentDtoList);

    @Mapping(target = "name", source = "addStudentRequestDto.name")
    @Mapping(target = "registrationDate", expression = "java(java.time.LocalDate.now())")
    @Mapping(target = "id", constant = "0")
    @Mapping(target = "group", source = "group")
    Student fromAddStudentRequestDto(AddStudentRequestDto addStudentRequestDto, Group group);

    StudentDto fromStudent(Student student);
}
