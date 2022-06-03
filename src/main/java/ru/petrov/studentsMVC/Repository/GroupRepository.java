package ru.petrov.studentsMVC.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.petrov.studentsMVC.Entity.Group;

public interface GroupRepository extends CrudRepository<Group,Long> {
}
