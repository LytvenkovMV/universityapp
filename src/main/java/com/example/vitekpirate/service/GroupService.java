package com.example.vitekpirate.service;

import com.example.vitekpirate.dto.AddGroupRequestDto;
import com.example.vitekpirate.dto.GetAllGroupResponseDto;

import java.util.List;

public interface GroupService {

    void addGroup(AddGroupRequestDto addGroupRequestDto);

    List<GetAllGroupResponseDto> getGroups();
}
