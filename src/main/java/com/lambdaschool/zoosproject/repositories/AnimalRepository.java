package com.lambdaschool.zoosproject.repositories;

import com.lambdaschool.zoosproject.models.Animal;
import com.lambdaschool.zoosproject.views.ZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    @Query(value = "SELECT  a.type as type, count(zooid) as countzoos " +
                    "FROM animal a LEFT JOIN zoo z " +
                    "ON a.zooid = z.zooid " +
                    "ORDER BY type", nativeQuery = true)
    List<ZooCount> findZooCount();
}
