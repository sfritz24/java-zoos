package com.lambdaschool.zoosproject.services;

import com.lambdaschool.zoosproject.models.Telephone;
import com.lambdaschool.zoosproject.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "telephoneservice")
public class TelephoneServiceImp implements TelephoneService
{
    @Autowired
    TelephoneRepository telerepos;

    @Transactional
    @Override
    public Telephone save(Telephone telephone)
    {
        return telerepos.save(telephone);
    }
}
