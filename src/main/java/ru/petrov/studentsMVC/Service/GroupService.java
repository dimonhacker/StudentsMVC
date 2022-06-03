package ru.petrov.studentsMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.petrov.studentsMVC.Entity.Group;
import ru.petrov.studentsMVC.Repository.GroupRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public List<Group> createGroups(){
        List<Group> groupList = getAll();
        if(groupList.size()==0) {
            groupList = new ArrayList<>();
            for (int i = 1; i < 4; i++) {
                Group group = new Group();
                group.setGroupName("Group " + i);
                group.setId(i);
                groupList.add(group);
            }
            groupRepository.saveAll(groupList);
        }
        return groupList;
    }

    private List<Group> getAll(){
        return (List<Group>) groupRepository.findAll();
    }

}
