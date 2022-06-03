package ru.petrov.studentsMVC.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sudent_group")
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String groupName;

    @OneToMany(mappedBy = "studentGroup")
    private List<Student> students =new ArrayList<>();

}
