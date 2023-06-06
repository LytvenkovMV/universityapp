package com.example.vitekpirate.mapper;

import com.example.vitekpirate.dto.AddGroupRequestDto;
import com.example.vitekpirate.dto.GetAllGroupResponseDto;
import com.example.vitekpirate.entity.Group;
import com.example.vitekpirate.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface GroupMapper {

    Group fromAddGroupRequestDto(AddGroupRequestDto addGroupRequestDto);

    @Mapping(target = "studentsQuantity", source = "students")
    GetAllGroupResponseDto fromGroup(Group group);

    default int getQuantityFromListOfStudents(List<Student> students) {
        return students.size();
    }
}
