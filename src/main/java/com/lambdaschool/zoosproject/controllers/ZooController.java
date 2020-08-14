package com.lambdaschool.zoosproject.controllers;

import com.lambdaschool.zoosproject.models.Zoo;
import com.lambdaschool.zoosproject.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController
{
    @Autowired
    private ZooService zooservice;

    // http://localhost:2019/zoos/zoos

    // http://localhost:2019/zoos/zoo/5

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> listAllZoos()
    {
        List<Zoo> zooList = zooservice.findAllZoos();
        return new ResponseEntity<>(zooList, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{zooid}", produces = "application/json")
    public ResponseEntity<?> listZooById(@PathVariable long zooid)
    {
        Zoo oneZoo = zooservice.findById(zooid);
        return new ResponseEntity<>(oneZoo, HttpStatus.OK);
    }
}
