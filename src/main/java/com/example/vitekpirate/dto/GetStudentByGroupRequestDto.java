package com.example.vitekpirate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DTO для получения списка студентов в группе")
public class GetStudentByGroupRequestDto {

    @ApiModelProperty(value = "ИД", required = true)
    private Integer groupId;
}
