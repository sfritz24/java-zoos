package com.lambdaschool.zoosproject;

import com.lambdaschool.zoosproject.models.Animal;
import com.lambdaschool.zoosproject.services.AnimalService;
import com.lambdaschool.zoosproject.services.TelephoneService;
import com.lambdaschool.zoosproject.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    private ZooService zooservice;

    @Autowired
    private AnimalService animalservice;

    @Autowired
    private TelephoneService telephoneservice;

    @Transactional
    @Override
    public void run(String... args)
    {
        Animal animal1 = new Animal("lion");
        animal1 = animalservice.save(animal1);
        Animal animal2 = new Animal("bear");
        animal2 = animalservice.save(animal2);
        Animal animal3 = new Animal("monkey");
        animal3 = animalservice.save(animal3);
        Animal animal4 = new Animal("penguin");
        animal4 = animalservice.save(animal4);
        Animal animal5 = new Animal("tiger");
        animal5 = animalservice.save(animal5);
        Animal animal6 = new Animal("turtle");
        animal6 = animalservice.save(animal6);
    }
}
