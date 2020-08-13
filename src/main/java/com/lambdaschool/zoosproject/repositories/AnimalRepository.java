package com.lambdaschool.zoosproject.repositories;

import com.lambdaschool.zoosproject.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
