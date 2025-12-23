package practice.First.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.First.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
  int x=100;

}
