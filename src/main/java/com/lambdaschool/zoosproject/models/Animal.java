package com.lambdaschool.zoosproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animaltype;

    @OneToMany(mappedBy = "animals", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("animals")
    private Set<ZooAnimals> zoos = new HashSet<>();

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

    public Set<ZooAnimals> getZoos()
    {
        return zoos;
    }

    public void setZoos(Set<ZooAnimals> zoos)
    {
        this.zoos = zoos;
    }
}
