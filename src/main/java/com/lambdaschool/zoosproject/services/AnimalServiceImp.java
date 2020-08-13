package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Animal;
import com.lambdaschool.zoosproject.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
