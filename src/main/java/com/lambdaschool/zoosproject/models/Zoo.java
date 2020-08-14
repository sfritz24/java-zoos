package com.lambdaschool.zoosproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoo")
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;
    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private List<Telephone> telephone = new ArrayList<>();

    @OneToMany(mappedBy = "zoos", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoos")
    private Set<ZooAnimals> animals = new HashSet<>();

    public Zoo()
    {
    }

    public Zoo(String zooname)
    {
        this.zooname = zooname;
    }

    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephone()
    {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone)
    {
        this.telephone = telephone;
    }

    public Set<ZooAnimals> getAnimals()
    {
        return animals;
    }

    public void setAnimals(Set<ZooAnimals> animals)
    {
        this.animals = animals;
    }
}
