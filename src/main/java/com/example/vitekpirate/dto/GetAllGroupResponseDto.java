package com.example.vitekpirate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DTO группы из БД")
public class GetAllGroupResponseDto {

    @ApiModelProperty(value = "ИД", required = true)
    private Integer id;

    @ApiModelProperty(value = "Имя", required = true)
    private String name;

    @ApiModelProperty(value = "Количество студентов", required = true)
    private Integer studentsQuantity;
}
