package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Animal;
import com.lambdaschool.zoosproject.repositories.AnimalRepository;
import com.lambdaschool.zoosproject.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value = "animalservice")
public class AnimalServiceImp implements AnimalService
{
    @Autowired
    AnimalRepository animalrepos;

    @Transactional
    @Override
    public Animal save(Animal animal)
    {
        return animalrepos.save(animal);
    }

    @Override
    public List<ZooCount> getZooCount()
    {
        List<ZooCount> list = animalrepos.findZooCount();
        return list;
    }
}
