package com.xu.springcloud.service;

import com.xu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptServiceFallBackFactory implements FallbackFactory<DeptService> {

    @Override
    public DeptService create(Throwable cause) {
        return new DeptService() {
            @Override
            public Dept get(long id) {
                Dept dept = new Dept();
                dept.setDname("服务降级");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
