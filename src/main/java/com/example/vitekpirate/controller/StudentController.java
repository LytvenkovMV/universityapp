package com.example.vitekpirate.controller;

import com.example.vitekpirate.dto.AddStudentRequestDto;
import com.example.vitekpirate.dto.DeleteStudentRequestDto;
import com.example.vitekpirate.dto.GetStudentByGroupRequestDto;
import com.example.vitekpirate.dto.GetStudentByGroupResponseDto;
import com.example.vitekpirate.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "Операции со студентами")
@RestController
@RequestMapping(path = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "Получить список студентов в группе")
    @GetMapping
    public GetStudentByGroupResponseDto getStudents(@RequestBody GetStudentByGroupRequestDto getStudentByGroupRequestDto) {
        return studentService.getStudents(getStudentByGroupRequestDto);
    }

    @ApiOperation(value = "Добавить студента")
    @PostMapping
    public void addStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
        studentService.addStudent(addStudentRequestDto);
    }

    @ApiOperation(value = "Удалить студента")
    @DeleteMapping
    public void deleteStudent(@RequestBody DeleteStudentRequestDto deleteStudentRequestDto) {
        studentService.deleteStudent(deleteStudentRequestDto);
    }
}
