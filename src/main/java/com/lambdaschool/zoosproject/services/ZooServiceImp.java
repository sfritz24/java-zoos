package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Zoo;
import com.lambdaschool.zoosproject.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Zoo> findAllZoos()
    {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findById(long id)
    {
        return zoorepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " Not Found!"));
    }
}
