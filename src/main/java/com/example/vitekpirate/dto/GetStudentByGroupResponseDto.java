package com.example.vitekpirate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DTO список студентов в группе из БД")
public class GetStudentByGroupResponseDto {

    @ApiModelProperty(value = "ИД группы", required = true)
    private Integer groupId;

    @ApiModelProperty(value = "Имя группы", required = true)
    private String groupName;

    @ApiModelProperty(value = "Список студентов в группе", required = true)
    List<StudentDto> studentDtoList;
}
