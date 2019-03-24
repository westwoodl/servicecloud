package com.xu.springcloud.controller;

import com.xu.springcloud.entities.Dept;
import com.xu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService service;

    @RequestMapping(value="dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value="dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }


    @RequestMapping(value="dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value="dept/discovery", method = RequestMethod.GET)
    public List<String> discovery(){
        return discoveryClient.getServices();
    }


}
