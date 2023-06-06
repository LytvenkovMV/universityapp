package com.example.vitekpirate.controller;

import com.example.vitekpirate.dto.ErrorDto;
import com.example.vitekpirate.service.GroupIdException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler
            (value
            = { GroupIdException.class})
    public ResponseEntity<ErrorDto> handleConflict() {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setCode(404);
        errorDto.setMessage("Нет группы с таким ИД");
        return ResponseEntity.status(404).body(errorDto);
    }
}
