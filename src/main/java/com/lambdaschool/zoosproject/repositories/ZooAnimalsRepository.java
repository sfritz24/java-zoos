package com.lambdaschool.zoosproject.repositories;

import com.lambdaschool.zoosproject.models.ZooAnimals;
import com.lambdaschool.zoosproject.models.ZooAnimalsId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalsRepository extends CrudRepository<ZooAnimals, ZooAnimalsId>
{
}
