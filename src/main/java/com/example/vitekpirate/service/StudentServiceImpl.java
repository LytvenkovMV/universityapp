package com.example.vitekpirate.service;

import com.example.vitekpirate.dto.*;
import com.example.vitekpirate.entity.Group;
import com.example.vitekpirate.entity.Student;
import com.example.vitekpirate.mapper.StudentMapper;
import com.example.vitekpirate.repository.GroupRepository;
import com.example.vitekpirate.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public GetStudentByGroupResponseDto getStudents(GetStudentByGroupRequestDto getStudentByGroupRequestDto) {

        log.info("Student service: start method getStudents");

        Group group = groupRepository.findById(getStudentByGroupRequestDto.getGroupId())
                .orElseThrow(() -> {
                    throw new GroupIdException();
                });

        log.info("Student service: group found");

        List<StudentDto> studentDtoList = group.getStudents().stream()
                .map(Student -> studentMapper.fromStudent(Student))
                .collect(Collectors.toList());

        GetStudentByGroupResponseDto getStudentByGroupResponseDto = studentMapper.fromGroupAndStudentDtoList(group, studentDtoList);

        return getStudentByGroupResponseDto;
    }

    @Override
    public void addStudent(AddStudentRequestDto addStudentRequestDto) {

        log.info("Student service: start method addStudent");

        Group group = groupRepository.findById(addStudentRequestDto.getGroupId())
                .orElseThrow(() -> {
                    throw new GroupIdException();
                });

        log.info("Student service: group found");

        Student student = studentMapper.fromAddStudentRequestDto(addStudentRequestDto, group);

        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(DeleteStudentRequestDto deleteStudentRequestDto) {

        log.info("Student service: start method deleteStudent");

        studentRepository.deleteById(deleteStudentRequestDto.getId());
    }
}
