package com.example.vitekpirate.service;

import com.example.vitekpirate.dto.AddGroupRequestDto;
import com.example.vitekpirate.dto.GetAllGroupResponseDto;
import com.example.vitekpirate.entity.Group;
import com.example.vitekpirate.mapper.GroupMapper;
import com.example.vitekpirate.repository.GroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    GroupMapper groupMapper;

    @Override
    public List<GetAllGroupResponseDto> getGroups() {

        log.info("Group service: start method getGroups");

        List<Group> allGroups = groupRepository.findAll();

        List<GetAllGroupResponseDto> getAllGroupResponseDtoList = allGroups.stream()
                .map(Group -> groupMapper.fromGroup(Group))
                .collect(Collectors.toList());
        return getAllGroupResponseDtoList;
    }

    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {

        log.info("Group service: start method addGroups");

        Group group = groupMapper.fromAddGroupRequestDto(addGroupRequestDto);
        groupRepository.save(group);
    }
}
