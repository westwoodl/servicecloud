package com.xu.springcloud.controller;

import com.xu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {
    //private static final String  PRE_URI = "http://localhost:8001";
    private static final String  PRE_URI = "http://servicecloud-dept";

    @Autowired
    private RestTemplate template;

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return template.postForObject(PRE_URI+"/dept/add", dept, boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return template.getForObject(PRE_URI+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return template.getForObject("http://servicecloud-dept/dept/list", List.class);
    }

}
