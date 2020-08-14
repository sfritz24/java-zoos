package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Zoo;

import java.util.List;

public interface ZooService
{
    List<Zoo> findAllZoos();

    Zoo findById(long id);

    Zoo save(Zoo zoo);
}
