package com.lambdaschool.zoosproject.models;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animaltype;

    public Animal()
    {
    }

    public Animal(String animaltype)
    {
        this.animaltype = animaltype;
    }

    public long getAnimalid()
    {
        return animalid;
    }

    public void setAnimalid(long animalid)
    {
        this.animalid = animalid;
    }

    public String getAnimaltype()
    {
        return animaltype;
    }

    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }
}
