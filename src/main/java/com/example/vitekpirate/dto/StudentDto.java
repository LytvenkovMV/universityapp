package com.example.vitekpirate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DTO студента из БД")
public class StudentDto {

    @ApiModelProperty(value = "ИД", required = true)
    private Integer id;

    @ApiModelProperty(value = "Имя", required = true)
    private String name;

    @ApiModelProperty(value = "Фамилия", required = true)
    private String surname;

    @ApiModelProperty(value = "Дата регистрации", required = true)
    private String registrationDate;
}
