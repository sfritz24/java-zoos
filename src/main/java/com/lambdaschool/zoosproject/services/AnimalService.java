package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Animal;
import com.lambdaschool.zoosproject.views.ZooCount;

import java.util.List;

public interface AnimalService
{
    List<ZooCount> getZooCount();

    Animal save(Animal animal);
}
