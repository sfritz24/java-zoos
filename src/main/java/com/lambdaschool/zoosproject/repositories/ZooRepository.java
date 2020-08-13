package com.lambdaschool.zoosproject.repositories;

import com.lambdaschool.zoosproject.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
}
