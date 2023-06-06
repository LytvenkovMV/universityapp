package com.example.vitekpirate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DTO для добавления студента")
public class AddStudentRequestDto {

    @ApiModelProperty(value = "Имя", required = true)
    private String name;

    @ApiModelProperty(value = "Фамилия", required = true)
    private String surname;

    @ApiModelProperty(value = "ИД группы", required = true)
    private Integer groupId;
}
