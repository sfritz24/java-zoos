package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Zoo;
import com.lambdaschool.zoosproject.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "zooservice")
public class ZooServiceImp implements ZooService
{
    @Autowired
    ZooRepository zoorepos;

    @Transactional
    @Override
    public Zoo save(Zoo zoo)
    {
        return zoorepos.save(zoo);
    }
}
