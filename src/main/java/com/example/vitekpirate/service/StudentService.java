package com.example.vitekpirate.service;

import com.example.vitekpirate.dto.AddStudentRequestDto;
import com.example.vitekpirate.dto.DeleteStudentRequestDto;
import com.example.vitekpirate.dto.GetStudentByGroupRequestDto;
import com.example.vitekpirate.dto.GetStudentByGroupResponseDto;

public interface StudentService {

    void addStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudent(DeleteStudentRequestDto deleteStudentRequestDto);

    GetStudentByGroupResponseDto getStudents(GetStudentByGroupRequestDto getStudentByGroupRequestDto);
}
