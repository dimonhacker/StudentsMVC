package ru.petrov.studentsMVC.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String surname;
    private String patronymic;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar birthday;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Group studentGroup =new Group();

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", studentGroup=" + studentGroup +
                '}';
    }
}
