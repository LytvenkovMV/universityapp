package com.example.vitekpirate.controller;

import com.example.vitekpirate.dto.AddGroupRequestDto;
import com.example.vitekpirate.dto.GetAllGroupResponseDto;
import com.example.vitekpirate.service.GroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Операции с группами")
@RestController
@RequestMapping(path = "/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @ApiOperation("Получить список групп")
    @GetMapping
    public List<GetAllGroupResponseDto> getGroups() {
        return groupService.getGroups();
    }

    @ApiOperation("Добавить группу")
    @PostMapping
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto) {
        groupService.addGroup(addGroupRequestDto);
    }
}
